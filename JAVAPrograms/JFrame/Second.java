import javax.swing.*;
import java.awt.*;

public class Second extends  JFrame
{
    Second()
    {
     this.setSize(1080,720);  // Sets the Size of the this
     this.setTitle(" this Title");  // Sets title for the this
     this.setDefaultCloseOperation( this.EXIT_ON_CLOSE); // Exit Out of the Application
     this.setResizable(false);  // Prevents this from being resized
     this.setVisible(true); // Makes this visible

        ImageIcon image = new ImageIcon("1.jpg"); // Create an Image Icon 
     this.setIconImage(image.getImage());   //  Change Icon of this

     this.getContentPane().setBackground(new Color(24,44,53)); //Change the Color of the Background
     this.getContentPane().setBackground(new Color(0x014564)); //Change the Color of the Background
    }    

    public static void main(String[] args) 
    {
        Second s = new Second();
    }
}
