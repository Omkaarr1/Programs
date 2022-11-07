/*
 *      Date: 30/10/2022 22:16
 *      Creator: OMKAR (21BIT0530) 
 *      Singed under Section 107 of Copywrite Act.
 */
import java.util.*;
import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;

public class Login 
{
    JFrame frame = new Tools().frame();

    Login()
    {
        frame.setAlwaysOnTop(true);

        ImageIcon image = new ImageIcon("signupImage.png");
        JLabel label = new JLabel();
        JLabel loginText = new JLabel("LOGIN PAGE");
        label.setBounds(50,50,100,30);

        label.setIcon(image);
        label.setBounds(100,100,512,512);
        frame.add(label);
        frame.add(loginText);
    } 

    public Login(HashMap<String, String> loginInfo) {
    }

    public static void main(String[] args) 
    {
        Login i = new Login();
    }
}
