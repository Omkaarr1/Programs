import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContinueUser extends Tools implements ActionListener
{
    JFrame frame;
    JButton button1,button2,button3,button4;

    ContinueUser()
    {
        frame = new Tools().frame();
        button1 = new JButton("Withdraw");
        button2 = new JButton("Deposit");
        button3 = new JButton("Show Balance");
        button4 = new JButton("EXIT");

        button1.setBounds(100,100,100,25);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(100,150,100,25);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(100,200,150,25);
        button3.setFocusable(false);
        button3.addActionListener(this);
        
        button4.setBounds(100,250,100,25);
        button4.setFocusable(false);
        button4.addActionListener(this);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button1)
        {

        }

        if(e.getSource() == button2)
        {

        }

        if(e.getSource() == button3)
        {
            
        }

        if(e.getSource() == button4)
        {
            System.exit(0);
        }
    }
}
