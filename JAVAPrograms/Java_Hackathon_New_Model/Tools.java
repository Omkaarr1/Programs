/*
 *      Date: 30/10/2022 22:16
 *      Creator: OMKAR (21BIT0530) 
 *      Singed under Section 107 of Copywrite Act.
 */

import java.awt.*;
import javax.swing.*;

public class Tools 
{
    JFrame frame() // returns a Normal usual Frame
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,700);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }   
    
    JFrame frame(int width,int height) // Resturns a frame with specified Width and Height
    {
        JFrame frame = new JFrame();   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }

    JButton button(int x,int y) // Returns a button with normal size at positions 'x' and 'y'
    {
        JButton button = new JButton();
        button.setBounds(x,y,100,25);
        button.setFocusable(false);

        return button;
    }

    JButton button(int x,int y,int width,int height) //  Returns a button with size of 'width' and 'height' specified at positions 'x' and 'y'
    {
        JButton button = new JButton();
        button.setBounds(x,y,width,height);
        button.setFocusable(false);

        return button;
    }

    
    JButton button(String name,int x,int y,int width,int height) //Returns a button with size of 'width' and 'height' specified at positions 'x' and 'y' of name 'name'
    {
        JButton button = new JButton(name);
        button.setBounds(x,y,width,height);
        button.setFocusable(false);

        return button;
    }
    
    JTextField text(int x,int y,int width,int height) // Returns a Text field with size of 'width' and 'height' specified at positions 'x' and 'y'
    {
        JTextField text = new JTextField();
        text.setBounds(x,y,width,height);

        return text;
    }

    JPasswordField passwordField(int x,int y,int width,int height) // Returns a Password Field with size of 'width' and 'height' specified at positions 'x' and 'y'
    {
        JPasswordField text = new JPasswordField();
        text.setBounds(x,y,width,height);

        return text;
    }

    JLabel label(int x,int y) // Returns a Label with normal size at positions 'x' and 'y'
    {
        JLabel text = new JLabel();
        text.setBounds(x,y,250,35);
        text.setFont(new Font(null,Font.ITALIC,25));

        return text;
    }

    JLabel label(int x,int y,int width,int height) // Returns a label with size of 'width' and 'height' specified at positions 'x' and 'y'
    {
        JLabel text = new JLabel();
        text.setBounds(x,y,width,height);
        text.setFont(new Font(null,Font.ITALIC,25));

        return text;
    }   
}