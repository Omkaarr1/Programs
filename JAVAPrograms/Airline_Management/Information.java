/*
 *      NAME: OMKAR (21BIT0530) 
 *       ©  Copyright Act, 1957
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Information implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField name,address,phonenumber;
    JLabel nameLabel,addressLabel,phonenumberLabel,image,Continue;
    ImageIcon icon = new ImageIcon("information.jpg");
    JButton done = new JButton("DONE");
    JButton continuee = new JButton("Continue");
    
    Information()
    {
        name = new JTextField();
        address = new JTextField();
        phonenumber = new JTextField();
        image = new JLabel();
        Continue = new JLabel("DATA STORED SUCCESSFULLY");
        image.setIcon(icon);

        nameLabel =  new JLabel("Enter your Name:");
        nameLabel.setFont(new Font(null,Font.ITALIC,18));

        addressLabel = new JLabel("Enter Your Address:");
        addressLabel.setFont(new Font(null,Font.ITALIC,18));

        phonenumberLabel = new JLabel("Enter Your Phone Number:");
        phonenumberLabel.setFont(new Font(null,Font.ITALIC,18));

        done.setBounds(400,320,150,30);
        done.setFocusable(false);
        done.addActionListener(this);

        image.setBounds(50,80,200,380);

        nameLabel.setBounds(300,150,200,25);
        addressLabel.setBounds(300,200,200,25);
        phonenumberLabel.setBounds(300,250,240,25);

        name.setBounds(550,150,150,30);
        address.setBounds(550,200,150,30);
        phonenumber.setBounds(550,250,150,30);

        Continue.setBounds(400,390,300,30);
        Continue.setFont(new Font(null,Font.BOLD,18));
        Continue.setForeground(Color.GREEN);

        continuee.setBounds(400,450,150,30);
        continuee.setFocusable(false);
        continuee.addActionListener(this);

        frame.add(image);
        frame.add(nameLabel);
        frame.add(name);
        frame.add(address);
        frame.add(addressLabel);
        frame.add(phonenumber);
        frame.add(phonenumberLabel);
        frame.add(done);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == done)
        {
            
            frame.add(Continue);
            frame.add(continuee);
        }   

        if(e.getSource() == continuee)
        {
            frame.dispose();
        }
    }
}
