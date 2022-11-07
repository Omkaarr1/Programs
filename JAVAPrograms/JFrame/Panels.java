import java.awt.Color;
import java.awt.LayoutManager;
import java.lang.ProcessBuilder.Redirect;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

public class Panels 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        JPanel panel_red = new JPanel();
        JLabel lable = new JLabel();

        lable.setText("Hello");
        lable.setVerticalAlignment(JLabel.BOTTOM);
        lable.setHorizontalAlignment(JLabel.RIGHT);

        panel_red.setBackground(Color.RED);
        panel_red.setBounds(0,0,250,250);
        
        
        JPanel panel_blue = new JPanel();

        panel_blue.setBackground(Color.BLUE);
        panel_blue.setBounds(250,0,250,250);

        JPanel panel_green = new JPanel();

        panel_green.setBackground(Color.green);
        panel_green.setBounds(0,250,500,250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(550,550);
        frame.setVisible(true);

        frame.add(panel_red);
        panel_red.add(lable);
        frame.add(panel_blue);
        frame.add(panel_green);
        
    }    
}
