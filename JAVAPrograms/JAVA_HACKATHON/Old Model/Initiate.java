import javax.swing.*;
import java.awt.event.*;

public class Initiate implements ActionListener
{
    JFrame frame = new Tools().frame();
    JButton button1 = new JButton("Login As MODERATOR");
    JButton button2 = new JButton("Login As USER");
    JLabel label = new JLabel("LOGIN PAGE");
    
    Initiate()
    {
        label.setBounds(20,20,250,25);
        button1.setBounds(20, 50, 250, 25);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(20, 80, 250, 25);
        button2.setFocusable(false);
        button2.addActionListener(this);
        
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button1)
        {
            new Moderator();
            new Moderator(frame);
        }
        else if(e.getSource() == button2)
        {
            new User(frame);
        }
    }
}
