import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;

public class Main implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Welcome to Payroll Management System ");
    JButton opener = new JButton("Create Employee");
    JButton searcher = new JButton("Search Employee");
    JButton compute = new JButton("Comput Net Salary");
    JButton displayallemp = new JButton("Display All Employee");
    JButton logout = new JButton("Logout");
    HashMap<String,String> LoginInfo = new HashMap<String,String>();
    ImageIcon icon = new ImageIcon("Pic\\emp.jpg");
    JLabel image = new JLabel();

    Main(int x)
    {}

    Main()
    {   
        panel.setBounds(0,0,500,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        label.setBounds(100,50,500,30);
        label.setFont(new Font(null,Font.ITALIC,25));
        label.setForeground(new ColorUIResource(44, 44, 44));

        opener.setBounds(100,150,200,30);
        opener.setBackground(Color.black);
        opener.setForeground(Color.white);
        opener.setFocusable(false);
        opener.addActionListener(this);

        searcher.setBounds(100,200,200,30);
        searcher.setBackground(Color.black);
        searcher.setForeground(Color.white);
        searcher.setFocusable(false);
        searcher.addActionListener(this);
        
        
        compute.setBounds(100,250,200,30);
        compute.setBackground(Color.black);
        compute.setForeground(Color.white);
        compute.setFocusable(false);
        compute.addActionListener(this);

        displayallemp.setBounds(100,300,200,30);
        displayallemp.setBackground(Color.black);
        displayallemp.setForeground(Color.white);
        displayallemp.setFocusable(false);
        displayallemp.addActionListener(this);

           
        logout.setBounds(100,350,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFocusable(false);
        logout.addActionListener(this);

        image.setBounds(350,70,450,400);
        image.setIcon(icon);

    
        frame.add(image);
        frame.add(opener);
        frame.add(searcher);
        frame.add(compute);
        frame.add(displayallemp);
        frame.add(label);
        frame.add(logout);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
        frame.setLayout(null);
    } 

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == opener)
        {
            new CreateEmployee();
        }

        if(e.getSource() == searcher)
        {
            try 
            {
                new SearchEmployee();
            } catch (FileNotFoundException e1) 
            {}
        }

        if(e.getSource() == compute)
        {
            new Calculate();
        }

        if(e.getSource() == displayallemp)
        {
            try 
            {
                new DisplayAllEmployee();
            }
            catch(FileNotFoundException e1) 
            {} 
            catch(IOException e1) 
            {}
        }

        if(e.getSource() == logout)
        {
            frame.dispose();
            new LoginPageAsUser(LoginInfo);
        }
    }
    public static void main(String[] args) 
    {
        new LoginPageAsUser(new Main(0).LoginInfo);    
    }
}


class CreateEmployee implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel Name = new JLabel("Name:");
    JLabel Id = new JLabel("ID Number:");
    JLabel NOD = new JLabel("No of Days:");
    JLabel Salary = new JLabel("Salary:");
    JLabel DPC = new JLabel("Department:");
    JLabel RPD = new JLabel("Rate Per Day:");
    JTextField name = new JTextField();
    JTextField id = new JTextField();
    JTextField nod = new JTextField();
    JTextField dpc = new JTextField();
    JTextField salary = new JTextField();
    JTextField rpd = new JTextField();
    JButton done = new JButton("SUBMIT");
    ImageIcon icon = new ImageIcon("Pic\\create.jpg");
    JLabel image = new JLabel();

    CreateEmployee()
    {
        panel.setBounds(0,0,500,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        Id.setBounds(100,100,300,30);
        Id.setFont(new Font(null,Font.ITALIC,20));

        Name.setBounds(100,150,300,30);
        Name.setFont(new Font(null,Font.ITALIC,20));
        
        DPC.setBounds(100,200,300,30);
        DPC.setFont(new Font(null,Font.ITALIC,20));
        
        NOD.setBounds(100,250,300,30);
        NOD.setFont(new Font(null,Font.ITALIC,20));

        RPD.setBounds(100,300,300,30);
        RPD.setFont(new Font(null,Font.ITALIC,20));
        
        Salary.setBounds(100,350,300,30);
        Salary.setFont(new Font(null,Font.ITALIC,20));

        id.setBounds(290,100,300,30);
        name.setBounds(290,150,300,30);
        dpc.setBounds(290,200,300,30);
        nod.setBounds(290,250,300,30);
        rpd.setBounds(290,300,300,30);
        salary.setBounds(290,350,300,30);

        done.setBounds(100,430,100,30);
        done.setFocusable(false);
        done.setBackground(Color.black);
        done.setForeground(Color.white);
        done.addActionListener(this);

        image.setBounds(600,100,400,400);
        image.setIcon(icon);
        

        frame.add(done);
        frame.add(image);
        frame.add(name);
        frame.add(id);
        frame.add(dpc);
        frame.add(nod);
        frame.add(rpd);
        frame.add(salary);
        frame.add(Name);
        frame.add(Id);
        frame.add(DPC);
        frame.add(NOD);
        frame.add(RPD);
        frame.add(Salary);
        frame.add(panel);

        frame.setSize(1100,650);    
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == done)
        {
            try
            {
                RandomAccessFile writer = new RandomAccessFile("information.txt","rwd");

                writer.seek(writer.length()); // Append mode on

                writer.writeBytes(id.getText()+"\r\n");
                writer.writeBytes(name.getText()+"\r\n");
                writer.writeBytes(dpc.getText()+"\r\n");
                writer.writeBytes(nod.getText()+"\r\n");
                writer.writeBytes(rpd.getText()+"\r\n");
                writer.writeBytes(salary.getText()+"\r\n");
                writer.close();
                frame.dispose();
            }
            catch(Exception e2)
            {}
        }
    }
}

class SearchEmployee implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Enter Employee ID to Search:");
    JTextField text = new JTextField();
    JButton search = new JButton("Search");
    JButton back = new JButton("Back");
    boolean first = true;
    ImageIcon icon = new ImageIcon("Pic\\search.jpg");
    JLabel image = new JLabel();

    SearchEmployee() throws FileNotFoundException
    {
        panel.setBounds(0,0,500,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        label.setBounds(100,100,300,30);
        label.setFont(new Font(null,Font.ITALIC,20));

        text.setBounds(405,100,100,30);

        search.setBounds(100,150,100,30);
        search.setForeground(Color.white);
        search.setBackground(Color.BLACK);
        search.setFocusable(false);
        search.addActionListener(this);

        back.setBounds(250,150,100,30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);

        image.setBounds(100,200,400,400);
        image.setIcon(icon);
        
        frame.add(image);
        frame.add(label);
        frame.add(search);
        frame.add(back);
        frame.add(text);
        frame.add(panel);

        frame.setSize(700,700);  
        frame.setVisible(true);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String x;
        boolean check = true;

        if(e.getSource() == search)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader("information.txt")))
            {
                x = reader.readLine();

                if(x.equals(text.getText()))
                {
                    new printEmployee(x,reader);
                    return;
                }

                while(x!=null)
                {
                    for(int i=0;i<6;i++)
                    x=reader.readLine();

                    if(x!=null && x.equals(text.getText()))
                    {
                        new printEmployee(x,reader);
                        check = false;
                    }
                }

                if(check)
                {
                    JOptionPane.showMessageDialog(null,"Employee Not Found");
                    frame.dispose();
                }        
            }
            catch (IOException e1) 
            {}
        }

        if(e.getSource() == back)
        frame.dispose();
    }
}

class printEmployee implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel welcome = new JLabel("Details of the Employee");
    JLabel Name = new JLabel();
    JLabel Id = new JLabel();
    JLabel Desigination = new JLabel();
    JLabel Salary = new JLabel();
    JLabel DPC = new JLabel();
    JLabel RPD = new JLabel();
    JButton back = new JButton("Back");

    printEmployee(String x,BufferedReader reader) throws IOException
    {
        panel.setBounds(0,0,500,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        welcome.setBounds(100,50,300,30);
        welcome.setFont(new Font(null,Font.ITALIC,20));

        Name.setBounds(100,100,300,30);
        Name.setText("Name: "+reader.readLine());
        Name.setFont(new Font(null,Font.ITALIC,20));

        Id.setBounds(100,150,400,30);
        Id.setText("ID Number: "+x);
        Id.setFont(new Font(null,Font.ITALIC,20));
        
        Desigination.setBounds(100,200,400,30);
        Desigination.setText("Department Code: "+reader.readLine());
        Desigination.setFont(new Font(null,Font.ITALIC,20));
        
        DPC.setBounds(100,250,400,30);
        DPC.setText("Desigination: "+reader.readLine());
        DPC.setFont(new Font(null,Font.ITALIC,20));
        
        RPD.setBounds(100,300,400,30);
        RPD.setText("Rate Per Day: "+reader.readLine());
        RPD.setFont(new Font(null,Font.ITALIC,20));

        Salary.setBounds(100,350,400,30);
        Salary.setText("Salary: "+reader.readLine());
        Salary.setFont(new Font(null,Font.ITALIC,20));

        back.setBounds(200,400,100,30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);

        frame.add(Name);
        frame.add(welcome);
        frame.add(Id);
        frame.add(Desigination);
        frame.add(DPC);
        frame.add(RPD);
        frame.add(Salary);
        frame.add(back);
        frame.add(panel);
        
        frame.setSize(500,500);    
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == back)
        {
            frame.dispose();
        }
    }
}

class LoginPageAsUser implements ActionListener 
{
    HashMap<String,String> Logininfo = new HashMap<String,String>();
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();
    JLabel loginMessage = new JLabel("LOGIN PAGE");
    JLabel user = new JLabel("USERNAME:");
    JLabel password = new JLabel("PASSWORD:");
    JLabel welcomemessage = new JLabel("Welcome to Login Page");
    JLabel image = new JLabel();
    JLabel imageForNewAccount = new JLabel();
    JLabel messageLabel = new JLabel();
    ImageIcon icon = new ImageIcon("Pic\\signupIcon.png");
    ImageIcon iconForNewAccount = new ImageIcon("Pic\\newaccount.png");
    JTextField userField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton Loginbutton = new JButton("LOGIN");
    JButton ResetButton  = new JButton("RESET");
    JButton submit = new JButton("SUBMIT");
    JButton Create_Account = new JButton("CREATE ACCOUNT");
    JButton exit = new JButton("EXIT");
    JButton continuee = new JButton("Continue");
    JPanel panel = new JPanel();

    LoginPageAsUser()
    {
    }

    LoginPageAsUser(HashMap<String,String> Logininfo)
    {
        panel.setBounds(0,0,750,600);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        this.Logininfo = Logininfo;
        image.setIcon(icon);
        image.setBounds(100,0,512,512);

        loginMessage.setBounds(300,100,200,30);
        loginMessage.setFont(new Font(null,Font.BOLD,25));
        
        user.setBounds(250,210,150,30);
        user.setFont(new Font(null,Font.BOLD,20));
        
        password.setBounds(250,260,150,30);
        password.setFont(new Font(null,Font.BOLD,20));

        userField.setBounds(390,212,150,30);
        passwordField.setBounds(390,262,150,30);

        Loginbutton.setBounds(250,310,120,35);
        Loginbutton.setForeground(Color.white);
        Loginbutton.setBackground(Color.BLACK);
        Loginbutton.setFocusable(false);
        Loginbutton.addActionListener(this);

        ResetButton.setBounds(410,310,120,35);
        ResetButton.setForeground(Color.white);
        ResetButton.setBackground(Color.BLACK);
        ResetButton.setFocusable(false);
        ResetButton.addActionListener(this);

        Create_Account.setBounds(250,360,150,30);
        Create_Account.setForeground(Color.white);
        Create_Account.setBackground(Color.BLACK);
        Create_Account.setFocusable(false);
        Create_Account.addActionListener(this);

        exit.setBounds(410,360,120,30);
        exit.setForeground(Color.white);
        exit.setBackground(Color.BLACK);
        exit.setFocusable(false);
        exit.addActionListener(this);

        continuee.setBounds(250,520,100,30);
        continuee.setForeground(Color.white);
        continuee.setBackground(Color.BLACK);
        continuee.setFocusable(false);
        continuee.addActionListener(this);

        welcomemessage.setBounds(250,430,300,35);
        welcomemessage.setFont(new Font(null,Font.ITALIC,25));


        messageLabel.setBounds(250,480,300,35);


        frame.add(user);
        frame.add(welcomemessage);
        frame.add(Loginbutton);
        frame.add(ResetButton);
        frame.add(Create_Account);
        frame.add(userField);
        frame.add(exit);
        frame.add(passwordField);
        frame.add(password);
        frame.add(image);
        frame.add(loginMessage);
        frame.add(messageLabel);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    void newaccount()
    {
        panel.setBounds(0,0,750,600);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        imageForNewAccount.setIcon(iconForNewAccount);
        imageForNewAccount.setBounds(370,10,512,512);

        welcomemessage.setText("Welcome to SignUp Page");
        welcomemessage.setBounds(100,50,300,30);

        user.setBounds(50,150,150,30);
        user.setFont(new Font(null,Font.BOLD,20));
        
        password.setBounds(50,200,150,30);
        password.setFont(new Font(null,Font.BOLD,20));

        userField.setBounds(200,152,150,30);
        passwordField.setBounds(200,202,150,30);

        submit.setBounds(50,252,120,35);
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.setFocusable(false);
        submit.addActionListener(this);

        ResetButton.setBounds(180,252,120,35);
        ResetButton.setFocusable(false);
        ResetButton.addActionListener(this);

        frame2.add(submit);
        frame2.add(imageForNewAccount);
        frame2.add(welcomemessage);
        frame2.add(ResetButton);
        frame2.add(userField);
        frame2.add(passwordField);
        frame2.add(password);
        frame2.add(user);
        frame2.add(panel);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(700,600);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == ResetButton)
        {
            userField.setText("");
            passwordField.setText("");
        }

        if(e.getSource() == Create_Account)
        {
            newaccount();
        }

        if(e.getSource() == submit)
        {
            Logininfo.put(userField.getText(),String.valueOf(passwordField.getPassword()));
            frame.dispose();
            frame2.dispose();
            new LoginPageAsUser(Logininfo);
        }

        if(e.getSource() == Loginbutton)
        {
            String user = userField.getText();
            String pass = String.valueOf(passwordField.getPassword());

            if(Logininfo.containsKey(user))
            {
                if(Logininfo.get(user).equals(pass))
                {
                    messageLabel.setForeground(Color.BLUE);
                    messageLabel.setFont(new Font(null,Font.ITALIC,25));
                    messageLabel.setText("Login Successfull!");

                    frame.add(continuee);
                }
                else
                {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setFont(new Font(null,Font.ITALIC,25));
                    messageLabel.setText("Wrong Password!");
                }
            }
            else
            {
                messageLabel.setForeground(Color.red);
                messageLabel.setFont(new Font(null,Font.ITALIC,25));
                messageLabel.setText("User Not Found!");
            }
        }

        if(e.getSource() == continuee)
        {
            frame.dispose();
            new Main();
        }

        if(e.getSource() == exit)
        System.exit(0);
    }
}

class Calculate implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Please Enter Employee ID:");
    JTextField text = new JTextField();
    JButton calculate = new JButton("Calculate");
    ImageIcon icon = new ImageIcon("Pic\\salary.jpg");
    JLabel image = new JLabel();

    Calculate()
    {
        panel.setBounds(0,0,600,600);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        label.setBounds(30,50,300,30);
        label.setFont(new Font(null,Font.ITALIC,20));
        text.setBounds(300,50,150,30);

        
        calculate.setBounds(300,100,100,30);
        calculate.setForeground(Color.white);
        calculate.setBackground(Color.BLACK);
        calculate.setFocusable(false);
        calculate.addActionListener(this);

        image.setBounds(100,150,400,400);
        image.setIcon(icon);

        frame.add(label);
        frame.add(image);
        frame.add(text);
        frame.add(calculate);
        frame.add(panel);

        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String x;
        if(e.getSource() == calculate)
        {
            x = text.getText();
            frame.dispose();
            try 
            {
                new printCalculation(x);
            }
            catch(IOException e1) 
            {}
        }
    }
}

class printCalculation implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel start = new JLabel("---------------------------------------------------------");
    JLabel end = new JLabel("---------------------------------------------------------");
    JButton back = new JButton("Back");
    
    
    printCalculation(String x) throws IOException
    {
        boolean check = true;
        String input="xyz";

        panel.setBounds(0,0,700,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        start.setBounds(50,30,500,30);
        start.setFont(new Font(null,Font.ITALIC,20));

        end.setBounds(50,300,500,30);
        end.setFont(new Font(null,Font.ITALIC,20));

        back.setBounds(500,350,100,30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);


        BufferedReader reader = new BufferedReader(new FileReader("information.txt"));
        input = reader.readLine();

        while(input!=null)
        {
            if(input.equals(x))
            {
                check = false;
                break;
            }

            for(int i=0;i<6;i++)
            input = reader.readLine();
        }

        if(check)
        {
            JOptionPane.showMessageDialog(null,"Employee Not Found");
            return;
        }

        JLabel empid = new JLabel("Employee ID : "+input);
        
        for(int i=0;i<5;i++)
        input = reader.readLine();

        JLabel salary = new JLabel("Salary : "+input);
        JLabel net = new JLabel("5% of Salary"+" : "+((0.05*Integer.valueOf(input))+""));
        JLabel tax = new JLabel("Tax Payable : "+" 0.3 % of Net Salay = "+(0.3*((0.05*Integer.valueOf(input)))+""));
        JLabel total = new JLabel("Total Income : "+(Integer.valueOf(input)+(0.05*Integer.valueOf(input))+(0.3*((0.05*Integer.valueOf(input))))));

        empid.setFont(new Font(null,Font.ITALIC,20));
        salary.setFont(new Font(null,Font.ITALIC,20));
        net.setFont(new Font(null,Font.ITALIC,20));
        tax.setFont(new Font(null,Font.ITALIC,20));
        total.setFont(new Font(null,Font.ITALIC,20));

        empid.setBounds(50,50,700,30);
        salary.setBounds(50,100,700,30);
        net.setBounds(50,150,700,30);
        tax.setBounds(50,200,700,30);
        total.setBounds(50,250,700,30);

        reader.close();

        frame.add(start);
        frame.add(empid);
        frame.add(salary);
        frame.add(net);
        frame.add(tax);
        frame.add(total);
        frame.add(end);
        frame.add(back);
        frame.add(panel);

        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == back)
        {
            frame.dispose();
        }
    }
}

class DisplayAllEmployee implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel Main_Name = new JLabel("Name");
    JLabel Main_ID = new JLabel("ID");
    JLabel Main_Department = new JLabel("Department");
    JLabel Main_Salary = new JLabel("Salary");
    JButton back = new JButton("Back");
    
    DisplayAllEmployee() throws IOException
    {
        panel.setBounds(0,0,900,500);
        panel.setBackground(new ColorUIResource(87, 255, 209));

        Main_Name.setBounds(10,10,200,30);
        Main_Name.setFont(new Font(null,Font.BOLD,20));

        Main_ID.setBounds(150,10,200,30);
        Main_ID.setFont(new Font(null,Font.BOLD,20));

        Main_Department.setBounds(250,10,200,30);
        Main_Department.setFont(new Font(null,Font.BOLD,20));

        Main_Salary.setBounds(450,10,200,30);
        Main_Salary.setFont(new Font(null,Font.BOLD,20));

        frame.add(Main_Name);
        frame.add(Main_ID);
        frame.add(Main_Department);
        frame.add(Main_Salary);
        

        String salary,name,id,department;
        salary=name=id=department="";

        BufferedReader reader = new BufferedReader(new FileReader("information.txt"));
        int x=0,y=0;

        for(;salary!=null;)
        {
            id=reader.readLine();
            name=reader.readLine();
            department = reader.readLine();
            reader.readLine();
            reader.readLine();
            salary=reader.readLine();

            JLabel nameLabel = new JLabel(name);
            nameLabel.setFont(new Font(null,Font.ITALIC,20));

            JLabel idLabel = new JLabel(id);
            idLabel.setFont(new Font(null,Font.ITALIC,20));
            
            JLabel departmentLabel = new JLabel(department);
            departmentLabel.setFont(new Font(null,Font.ITALIC,20));
            
            JLabel salaryLabel = new JLabel(salary);
            salaryLabel.setFont(new Font(null,Font.ITALIC,20));
            
            nameLabel.setBounds(x+10,y+50,100,30);
            idLabel.setBounds(x+150,y+50,100,30);
            departmentLabel.setBounds(x+250,y+50,100,30);
            salaryLabel.setBounds(x+450,y+50,100,30);
            y+=30;

            frame.add(nameLabel);
            frame.add(idLabel);
            frame.add(departmentLabel);
            frame.add(salaryLabel);
        }

        
        back.setBounds(400,400,100,30);
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);

        frame.add(back);
        frame.add(panel);

        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == back)
        {
            frame.dispose();
        }  
    }
}