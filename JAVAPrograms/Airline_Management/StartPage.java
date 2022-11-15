/*
 *      NAME: OMKAR (21BIT0530) 
 *       ©  Copyright Act, 1957
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class StartPage implements ActionListener
{
    JLabel welcomeText;
    JFrame frame = new JFrame();
    JButton option1 = new JButton("LOGIN AS MODERATOR");
    JButton option2 = new JButton("LOGIN AS USER");
    HashMap<String,String> Logininfo = new HashMap<String,String>();

    StartPage()
    {
        welcomeText = new JLabel("Hello and Welcome! Please Choose An Option");
        welcomeText.setFont(new Font(null,Font.BOLD,20));
        welcomeText.setBounds(30,30,600,30);

        option1.setBounds(30,90,200,30);
        option1.setFocusable(false);
        option1.addActionListener(this);

        option2.setBounds(30,130,200,30);
        option2.setFocusable(false);
        option2.addActionListener(this);
        
        frame.add(welcomeText);
        frame.add(option1);
        frame.add(option2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == option1)
        {
            frame.dispose();
            new LoginPageAsModerator(Logininfo);
        }
        
        if(e.getSource() == option2)
        {
            frame.dispose();
            new LoginPageAsUser(Logininfo);
        }
    }

    public static void main(String[] args) 
    {
        new StartPage();
    }
}
