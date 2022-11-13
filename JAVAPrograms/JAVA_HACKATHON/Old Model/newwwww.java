import javax.swing.*;
import java.awt.event.*;
public class newwwww implements ActionListener
{
    JFrame frame = new JFrame();
    JButton button = new JButton("SUBMIT");
    JButton button2 = new JButton("CANCLE");
    JTextField text = new JTextField();
    JPasswordField password = new JPasswordField();

    newwwww()
    {
        button.setBounds(100,150,100,30);
        button.setFocusable(false);
        button.addActionListener(this);

        
        button2.setBounds(200,150,100,30);
        button2.setFocusable(false);
        button2.addActionListener(this);


        text.setBounds(100,50,100,30);
        password.setBounds(100,100,100,30);


        frame.add(button);
        frame.add(button2);
        frame.add(text);
        frame.add(password);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new newwwww();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            new User(frame);
        }

        if(e.getSource() == button2)
        System.out.println("Button2");
    }
}
