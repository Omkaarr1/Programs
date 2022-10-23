import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Myframe extends JFrame implements Action
{
    JButton button = new JButton();
    JLabel lable = new JLabel();
 
    Myframe()
    {
        ImageIcon image = new ImageIcon("2.jpg");
        ImageIcon icon = new ImageIcon("1.jpg");

        lable = new JLabel();
        lable.setIcon(icon);
        lable.setBounds(550,150,566,566);
        lable.setVisible(false);


        button.setBounds(0,0,350,350);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("POO!!"));
        button.setText("I'm a Button"); 
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-15);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(lable);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            lable.setVisible(true);
            // System.out.println("POO!!");
        }
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
}
