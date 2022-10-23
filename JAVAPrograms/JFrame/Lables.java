import java.awt.Color;
import java.awt.Font;
import java.util.logging.StreamHandler;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.LabelUI;

public class Lables 
{
    public static void main(String[] args) 
    {
        ImageIcon image = new ImageIcon("1.jpg");
        Border border = BorderFactory.createLineBorder(Color.blue,3);
        

        JLabel lable = new JLabel();
        lable.setText("Hello World");
        lable.setIcon(image);
        lable.setHorizontalTextPosition(JLabel.CENTER); //Set text LEFT CENTERED or RIGHT of IMAGE ICON
        lable.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER,BOTTOM 
        lable.setForeground(Color.green); // Set color to Text
        lable.setFont(new Font("My Boli",Font.ITALIC,20)); //Set font Texture  
        lable.setIconTextGap(50); //Set gap between FONT and Image
        lable.setBackground(Color.BLACK); // Set Background Color
        lable.setOpaque(true); // Display Background Color
        lable.setBorder(border); // Set the Border to any color
        lable.setVerticalAlignment(JLabel.CENTER); // Set Veritial Position of text and Image wintin Lable
        lable.setHorizontalAlignment(JLabel.CENTER);// Set Horizontal Position of text and Image wintin Lable
        // lable.setBounds(0,0,400,400); // Set X and Y position 

        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1808,720);
        frame.setVisible(true);
        // frame.setLayout(null); // To set Layout
        
        frame.add(lable);
        frame.pack(); // Adjust automatically

    }
}
