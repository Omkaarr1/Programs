import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.util.*;

public class Start implements ActionListener
{
    JFrame frame = new JFrame();
    JButton administrator = new JButton("Login As Administrator");
    JButton doctor = new JButton("Login As Doctor");
    JButton patient = new JButton("Login As Patient");
    JPanel panel = new JPanel();

    Start()
    {
        panel.setBounds(0,0,500,500);
        panel.setBackground(new ColorUIResource(0, 152, 255));

        administrator.setBounds(100,100,200,30);
        administrator.setFocusable(false);
        administrator.setForeground(Color.white);
        administrator.setBackground(Color.BLACK);
        administrator.addActionListener(this);

        doctor.setBounds(100,140,200,30);
        doctor.setFocusable(false);
        doctor.setForeground(Color.white);
        doctor.setBackground(Color.BLACK);
        doctor.addActionListener(this);

        patient.setBounds(100,180,200,30);
        patient.setFocusable(false);
        patient.setForeground(Color.white);
        patient.setBackground(Color.BLACK);
        patient.addActionListener(this);

        frame.add(administrator);
        frame.add(doctor);
        frame.add(patient);
        frame.add(panel);
       

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);    
        frame.setLayout(null);
        frame.setVisible(true);
    }  
    
    public static void main(String[] args) 
    {
        new Start();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == administrator)
        {
            frame.dispose();
            new administrator();
        }

        if(e.getSource() == patient)
        {

        }

        if(e.getSource() == doctor)
        {

        }
    }
}

class administrator implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel username = new JLabel("UserName:");
    JLabel password = new JLabel("Password:");
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JButton createButton = new JButton("Create Account");
    JLabel createAccountSuccessful = new JLabel();
    JLabel welcomemessage = new JLabel("Welcome To Login Page");
    HashMap<String,String> data = new HashMap<String,String>();

    administrator()
    {
        panel.setBounds(0,0,600,600);
        panel.setBackground(new ColorUIResource(0, 152, 255));

        username.setBounds(100,100,300,30);
        username.setFont(new Font(null,Font.ITALIC,30));

        password.setBounds(100,170,300,30);
        password.setFont(new Font(null,Font.ITALIC,30));

        user.setBounds(270,105,150,30);
        pass.setBounds(270,170,150,30);

        login.setBounds(150,230,100,30);
        login.setFocusable(false);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);

        reset.setBounds(280,230,100,30);
        reset.setFocusable(false);
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);

        createButton.setBounds(150,280,150,30);
        createButton.setFocusable(false);
        createButton.setBackground(Color.black);
        createButton.setForeground(Color.white);

        frame.add(username);
        frame.add(user);
        frame.add(password);
        frame.add(pass);
        frame.add(createButton);
        frame.add(login);
        frame.add(reset);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);    
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == reset)
        {
            user.setText("");
            pass.setText("");
        }

        if(e.getSource() == createButton)
        {
            data.put(user.getText(),String.valueOf(pass.getPassword()));
        }
        
        if(e.getSource() == login)
        System.out.println("Done");

    }
}
