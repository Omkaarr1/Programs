/*
 *      NAME: OMKAR (21BIT0530) 
 *       ©  Copyright Act, 1957
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPageAsUser  implements ActionListener 
{
    HashMap<String,String> Logininfo = new HashMap<String,String>();
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();
    JLabel loginMessage = new JLabel("LOGIN PAGE");
    JLabel user = new JLabel("USERNAME:");
    JLabel password = new JLabel("PASSWORD:");
    JLabel welcomemessage = new JLabel("Welcome to Login Page");
    JLabel image = new JLabel();
    JLabel imageForNewAccount = new JLabel();
    JLabel messageLabel = new JLabel();
    ImageIcon icon = new ImageIcon("signupIcon.png");
    ImageIcon iconForNewAccount = new ImageIcon("newaccount.png");
    JTextField userField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton Loginbutton = new JButton("LOGIN");
    JButton ResetButton  = new JButton("RESET");
    JButton submit = new JButton("SUBMIT");
    JButton Create_Account = new JButton("CREATE ACCOUNT");
    JButton continuee = new JButton("Continue");

    
    LoginPageAsUser()
    {
    }

    LoginPageAsUser(HashMap<String,String> Logininfo)
    {
        this.Logininfo = Logininfo;
        image.setIcon(icon);
        image.setBounds(100,0,512,512);

        loginMessage.setBounds(300,100,200,30);
        loginMessage.setFont(new Font(null,Font.BOLD,25));
        
        user.setBounds(250,210,150,30);
        user.setFont(new Font(null,Font.BOLD,20));
        
        password.setBounds(250,260,150,30);
        password.setFont(new Font(null,Font.BOLD,20));

        userField.setBounds(390,212,150,30);
        passwordField.setBounds(390,262,150,30);

        Loginbutton.setBounds(250,310,120,35);
        Loginbutton.setFocusable(false);
        Loginbutton.addActionListener(this);

        ResetButton.setBounds(390,310,120,35);
        ResetButton.setFocusable(false);
        ResetButton.addActionListener(this);

        Create_Account.setBounds(250,360,150,35);
        Create_Account.setFocusable(false);
        Create_Account.addActionListener(this);

        continuee.setBounds(250,520,100,30);
        continuee.setFocusable(false);
        continuee.addActionListener(this);

        welcomemessage.setBounds(250,430,300,35);
        welcomemessage.setFont(new Font(null,Font.ITALIC,25));


        messageLabel.setBounds(250,480,300,35);

        frame.add(user);
        frame.add(welcomemessage);
        frame.add(Loginbutton);
        frame.add(ResetButton);
        frame.add(Create_Account);
        frame.add(userField);
        frame.add(passwordField);
        frame.add(password);
        frame.add(image);
        frame.add(loginMessage);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    void newaccount()
    {
        imageForNewAccount.setIcon(iconForNewAccount);
        imageForNewAccount.setBounds(370,10,512,512);

        welcomemessage.setText("Welcome to SignUp Page");
        welcomemessage.setBounds(100,50,300,30);

        user.setBounds(50,150,150,30);
        user.setFont(new Font(null,Font.BOLD,20));
        
        password.setBounds(50,200,150,30);
        password.setFont(new Font(null,Font.BOLD,20));

        userField.setBounds(200,152,150,30);
        passwordField.setBounds(200,202,150,30);

        submit.setBounds(50,252,120,35);
        submit.setFocusable(false);
        submit.addActionListener(this);

        ResetButton.setBounds(180,252,120,35);
        ResetButton.setFocusable(false);
        ResetButton.addActionListener(this);

        frame2.add(submit);
        frame2.add(imageForNewAccount);
        frame2.add(welcomemessage);
        frame2.add(ResetButton);
        frame2.add(userField);
        frame2.add(passwordField);
        frame2.add(password);
        frame2.add(user);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(700,600);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == ResetButton)
        {
            userField.setText("");
            passwordField.setText("");
        }

        if(e.getSource() == Create_Account)
        {
            newaccount();
        }

        if(e.getSource() == submit)
        {
            Logininfo.put(userField.getText(),String.valueOf(passwordField.getPassword()));
            frame.dispose();
            frame2.dispose();
            new LoginPageAsUser(Logininfo);
        }

        if(e.getSource() == Loginbutton)
        {
            String user = userField.getText();
            String pass = String.valueOf(passwordField.getPassword());

            if(Logininfo.containsKey(user))
            {
                if(Logininfo.get(user).equals(pass))
                {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setFont(new Font(null,Font.ITALIC,25));
                    messageLabel.setText("Login Successfull!");

                    frame.add(continuee);
                }
                else
                {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setFont(new Font(null,Font.ITALIC,25));
                    messageLabel.setText("Wrong Password!");
                }
            }
            else
            {
                messageLabel.setForeground(Color.red);
                messageLabel.setFont(new Font(null,Font.ITALIC,25));
                messageLabel.setText("User Not Found!");
            }
        }

        if(e.getSource() == continuee)
        {
            frame.dispose();
            new User();
        }
    }

    public static void main(String[] args) 
    {
        new LoginPageAsModerator();
    }

}