/*
 *      NAME: OMKAR (21BIT0530) 
 *       ©  Copyright Act, 1957
 */

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.io.*;

public class BoardingPass 
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Your Boarding Pass:");
    JLabel nameLabel = new JLabel("Name:");
    JLabel AddressLabel = new JLabel("Address:");
    JLabel PhoneNumberLabel = new JLabel("Phone Number:");
    JLabel flightLabel = new JLabel("Flight Number:");
    JLabel gateNumberLabel = new JLabel("Gate Number:");
    JLabel setName = new JLabel();
    JLabel setAddress = new JLabel();
    JLabel setPhoneNumber = new JLabel();
    JLabel setFlightNumber = new JLabel();
    JLabel setGateNumber = new JLabel("23B");
    
    BufferedReader NameReader = new BufferedReader(new FileReader("Name.txt"));
    BufferedReader PhoneNumberReader = new BufferedReader(new FileReader("PhoneNumber.txt"));
    BufferedReader addressReader = new BufferedReader(new FileReader("Address.txt"));
    String Name,PhoneNumber,Address;

    BoardingPass() throws IOException
    {
        panel.setBounds(0,0,750,600);
        panel.setBackground(new ColorUIResource(0, 152, 255));

        label.setFont(new Font(null,Font.ITALIC,25));
        label.setBounds(50,50,230,30);

        Name = NameReader.readLine();
        Address = addressReader.readLine();
        PhoneNumber = PhoneNumberReader.readLine();

        nameLabel.setFont(new Font(null,Font.ITALIC,25));
        nameLabel.setBounds(50,100,100,30);
        
        AddressLabel.setFont(new Font(null,Font.ITALIC,25));
        AddressLabel.setBounds(50,150,100,30);

        PhoneNumberLabel.setFont(new Font(null,Font.ITALIC,25));
        PhoneNumberLabel.setBounds(50,200,200,30);

        flightLabel.setFont(new Font(null,Font.ITALIC,25));
        flightLabel.setBounds(340,100,200,30);

        gateNumberLabel.setFont(new Font(null,Font.ITALIC,25));
        gateNumberLabel.setBounds(340,145,200,30);

        setName.setText(Name);
        setAddress.setText(Address);
        setPhoneNumber.setText(PhoneNumber);
        setFlightNumber.setText(((int)(Math.random()*1000))+"");

        setName.setBounds(130,102,100,30);
        setName.setFont(new Font(null,Font.ITALIC,25));

        setAddress.setBounds(155,152,100,30);
        setAddress.setFont(new Font(null,Font.ITALIC,25));

        setPhoneNumber.setBounds(230,202,100,30);
        setPhoneNumber.setFont(new Font(null,Font.ITALIC,25));

        setFlightNumber.setFont(new Font(null,Font.ITALIC,25));
        setFlightNumber.setBounds(510,100,100,30);
        
        frame.add(label);
        frame.add(nameLabel);
        frame.add(AddressLabel);
        frame.add(PhoneNumberLabel);
        frame.add(gateNumberLabel);
        frame.add(flightLabel);
        frame.add(setFlightNumber);
        frame.add(setAddress);
        frame.add(setName);
        frame.add(setPhoneNumber);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException 
    {
        new BoardingPass();
    }
}
