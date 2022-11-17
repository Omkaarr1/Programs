/*
 *      NAME: OMKAR (21BIT0530) 
 *       ©  Copyright Act, 1957
 */

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Data  implements ActionListener
{
    double fare = 0.0d;
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();
    JLabel label = new JLabel("Welcome to Airline Booking");
    JLabel label2 = new JLabel("Please Select Any one Flight");
    JLabel label3 = new JLabel("Please Enter the Number of Pasengers ");
    JLabel label4 = new JLabel();
    JPanel panel1 = new JPanel();
    JRadioButton radio1 = new JRadioButton("DEL-BLR 18:40-21:35 (DIRECT) [ /PERSON 6500 ]");
    JRadioButton radio2 = new JRadioButton("DEL-MAA 06:15-08:50 (DIRECT) [ /PERSON 6500 ]");
    JRadioButton radio3 = new JRadioButton("MAA-COK 12:55-20-05 (1 STOP VIA BENGALURU) [ /PERSON 7900 ]");
    JRadioButton radio4 = new JRadioButton("DEL-IXM 08:10-13:40 (1 STOP VIA HYDERABAD) [ /PERSON 7900 ]");
    ButtonGroup group = new ButtonGroup();
    JButton done = new JButton("DONE");
    JButton confirm = new JButton("CONFIRM BOOKING");
    JTextArea text = new JTextArea();
    String Fare="";

    JTextField name,address,phonenumber;
    JLabel nameLabel,addressLabel,phonenumberLabel,image,Continue;
    ImageIcon icon = new ImageIcon("information.jpg");
    JButton donee = new JButton("DONE");
    JButton continuee = new JButton("Continue");
    
    Data()
    {
        panel1.setBackground(new ColorUIResource(35, 159, 255));
        panel1.setBounds(0,0,500,500);

        label.setFont(new Font("OPEN SANS", Font.ITALIC, 25));
        label.setForeground(new ColorUIResource(215, 45, 30));
        label.setBounds(70,10,300,30);

        label2.setFont(new Font("OPEN SANS", Font.ITALIC, 18));
        label2.setForeground(new ColorUIResource(215, 45, 30));
        label2.setBounds(50,60,300,30);
        
        label3.setFont(new Font("OPEN SANS", Font.ITALIC, 18));
        label3.setForeground(new ColorUIResource(215, 45, 30));
        label3.setBounds(50,230,350,30);

        text.setBounds(50,260,50,20);

        radio1.setFocusable(false);
        radio2.setFocusable(false);
        radio3.setFocusable(false);
        radio4.setFocusable(false);

        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        

        radio1.setBackground(new ColorUIResource(35, 159, 255));
        radio2.setBackground(new ColorUIResource(35, 159, 255));
        radio3.setBackground(new ColorUIResource(35, 159, 255));
        radio4.setBackground(new ColorUIResource(35, 159, 255));
        

        radio1.setBounds(50,100,300,20);
        radio2.setBounds(50,130,300,20);
        radio3.setBounds(50,160,450,20);
        radio4.setBounds(50,190,400,20);

        done.setBounds(50,300,150,30);
        done.setBackground(Color.green);
        done.setFocusable(false);
        done.addActionListener(this);
        
        confirm.setBounds(50,400,200,30);
        confirm.setBackground(Color.pink);
        confirm.setFocusable(false);
        confirm.addActionListener(this);
        

        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);
        frame.add(radio4);
        frame.add(label3);
        frame.add(label4);
        frame.add(text);
        frame.add(label);
        frame.add(label2);
        frame.add(panel1);
        frame.add(done);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);   
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == done)
        {
            if(radio1.isSelected() || radio2.isSelected())
            {
                fare = 6500.0*(Double.valueOf(text.getText()));

            }

            if(radio3.isSelected() || radio4.isSelected())
            {
                fare = 7900.0*(Double.valueOf(text.getText()));
            }
            
            Fare = "Total Fair of travel is: "+fare+"";

            label4.setText(Fare);
            label4.setFont(new Font("OPEN SANS", Font.ITALIC, 20));
            label4.setBounds(50,350,400,30);

            frame.add(confirm);
        }

        if(e.getSource() == confirm)
        {
            frame.dispose();
            information();
        }

        if(e.getSource() == donee)
        {
            try (FileWriter writer1 = new FileWriter("Name.txt",true))
            {
                writer1.write(name.getText());
                writer1.write("\n");
                writer1.close();
            }
            catch (IOException e1)
            {}

            try (FileWriter writer1 = new FileWriter("Address.txt",true))
            {
                writer1.write(address.getText());
                writer1.write("\n");
                writer1.close();
            }

            catch (IOException e1)
            {}
            
            try (FileWriter writer1 = new FileWriter("PhoneNumber.txt",true))
            {
                writer1.write(phonenumber.getText());
                writer1.write("\n");
                writer1.close();
            }
            catch (IOException e1)
            {}

            frame2.dispose();
            
            try 
            {
                BoardingPass p = new BoardingPass();
            }
            catch (FileNotFoundException e1) 
            {} 
            catch (IOException e1) 
            {}
        }
    }

    void information()
    {
        panel1.setBackground(new ColorUIResource(35, 159, 255));
        panel1.setBounds(0,0,750,700);

        name = new JTextField();
        address = new JTextField();
        phonenumber = new JTextField();
        image = new JLabel();
        image.setIcon(icon);

        nameLabel =  new JLabel("Enter your Name:");
        nameLabel.setFont(new Font(null,Font.ITALIC,18));

        addressLabel = new JLabel("Enter Your Address:");
        addressLabel.setFont(new Font(null,Font.ITALIC,18));

        phonenumberLabel = new JLabel("Enter Your Phone Number:");
        phonenumberLabel.setFont(new Font(null,Font.ITALIC,18));

        donee.setBounds(400,320,150,30);
        donee.setBackground(Color.green);
        donee.setFocusable(false);
        donee.addActionListener(this);

        image.setBounds(50,80,200,380);

        nameLabel.setBounds(300,150,200,25);
        addressLabel.setBounds(300,200,200,25);
        phonenumberLabel.setBounds(300,250,240,25);

        name.setBounds(550,150,150,30);
        address.setBounds(550,200,150,30);
        phonenumber.setBounds(550,250,150,30);

        frame2.add(image);
        frame2.add(nameLabel);
        frame2.add(name);
        frame2.add(address);
        frame2.add(addressLabel);
        frame2.add(phonenumber);
        frame2.add(phonenumberLabel);
        frame2.add(donee);
        frame2.add(panel1);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(750,700);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}
