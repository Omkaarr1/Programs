import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Start implements ActionListener
{
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton createAccountButton = new JButton("Create Account");
    JLabel usernameLabel = new JLabel("USERNAME:");
    JLabel passwordLabel = new JLabel("PASSWORD:");
    JLabel loginsuccessful = new JLabel("Login Successful");
    JLabel loginunsuccessful = new JLabel("Login Unsuccessful");
    JLabel createaccountsuccessful = new JLabel("Account Created Successful");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    BufferedWriter userWriter = new BufferedWriter(new FileWriter("username.txt"));
    BufferedWriter passwordWriter = new BufferedWriter(new FileWriter("password.txt"));
    int first = 0;
    String readUsername,readPassword;
    Boolean verification = false;

    Start() throws IOException
    {
        usernameLabel.setBounds(50,100,100,30);
        passwordLabel.setBounds(50,150,100,30);

        username.setBounds(150,100,100,30);
        password.setBounds(150,150,100,30);

        
        createaccountsuccessful.setBounds(50,300,300,30);
        createaccountsuccessful.setFont(new Font(null,Font.ITALIC,20));
        createaccountsuccessful.setForeground(Color.green);

        loginsuccessful.setBounds(50,300,200,30);
        loginsuccessful.setFont(new Font(null,Font.ITALIC,20));
        loginsuccessful.setForeground(Color.green);
        
        loginunsuccessful.setBounds(50,300,200,30);
        loginunsuccessful.setFont(new Font(null,Font.ITALIC,20));
        loginunsuccessful.setForeground(Color.red);

        loginButton.setBounds(50,200,100,30);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(160,200,100,30);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        createAccountButton.setBounds(50,240,200,30);
        createAccountButton.setFocusable(false);
        createAccountButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(username);
        frame.add(usernameLabel);
        frame.add(password);
        frame.add(passwordLabel);
        frame.add(createAccountButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String x,y;
        
        if(e.getSource() == resetButton)
        {
            username.setText("");
            password.setText("");
        }

        if(e.getSource() == loginButton)
        {
            verification = false;
            frame.remove(createaccountsuccessful); 
            frame.remove(loginunsuccessful);            
            
            x = username.getText();
            y = String.valueOf(password.getPassword());

            readPassword=readUsername="";

            try
            {
            FileReader ureader = new FileReader("username.txt");
            BufferedReader userreader = new BufferedReader(ureader);
    
            FileReader preader = new FileReader("password.txt");
            BufferedReader passwordreader = new BufferedReader(preader);

            readUsername = userreader.readLine();
            readPassword = passwordreader.readLine();


            if(readUsername.equals(x))
            {
            if(readPassword.equals(y))
            verification = true;
            }
            else
            {
                while(userreader.readLine()!=null)
                {
                    System.out.println(readUsername+" "+readPassword);
                    readUsername = userreader.readLine();
                    readPassword = passwordreader.readLine();
                    if(readUsername.equals(x))
                    if(readPassword.equals(y))
                    {
                        verification = true;
                    }
                }
            }

            System.out.println(verification);

            if(verification)
            {
                
                frame.add(loginsuccessful);
            }
            else
            {
                frame.remove(loginsuccessful);
                frame.add(loginunsuccessful);
            }
            userreader.close();
            passwordreader.close();
            }
            catch(Exception e1)
            {}
        }

        if(e.getSource() == createAccountButton)
        {
            x = username.getText()+"\n";
            y = String.valueOf(password.getPassword())+"\n";

            if(first == 0)
            {
                try 
                {
                    userWriter.write(x);
                    passwordWriter.write(y);
                } catch (IOException e1) 
                {}
            }

            try 
            {
                set(x,y);
            }
            catch (IOException e1) 
            {}

            frame.add(createaccountsuccessful);
        }
    }

    private void set(String x, String y) throws IOException 
    {
        BufferedWriter password = new BufferedWriter(new FileWriter("password.txt",true));
        BufferedWriter user = new BufferedWriter(new FileWriter("username.txt",true));

        user.write(x);
        password.write(y);

        user.close();
        password.close();
    }
}