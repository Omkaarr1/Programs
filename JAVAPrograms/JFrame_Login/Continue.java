import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Continue implements ActionListener 
{
    JFrame frame;
    JButton button;
    JLabel label;

    Continue()
    {
        Welcome w = new Welcome(null, null);
        frame=w.create();

        label = new JLabel("Welcome to File Opener!");
        label.setBounds(15,10, 200, 25);

        button = new JButton("Click Here to Open A TEXT File!");
        button.setBounds(40,40,300,25);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            
        }    
    }
}
