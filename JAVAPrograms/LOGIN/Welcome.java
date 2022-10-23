package LOGIN;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Welcome implements ActionListener
{
    JFrame frame = new JFrame();
    JLabel welcomeLable = new JLabel("Hello and Welcome");
    JButton button = new JButton("Click to Know the Number of Account's");

    void activate()
    {
        welcomeLable.setBounds(0,0,150,150);
        welcomeLable.setFont(new Font(null,Font.PLAIN,15));

        button.setBounds(125,100,350,25);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(welcomeLable);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            frame.dispose();
            
            JFrame frame = new JFrame();

            


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,600);
            frame.setLayout(null);
            frame.setVisible(true);
        }    
    }
}
