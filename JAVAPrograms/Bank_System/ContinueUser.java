import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContinueUser extends Tools implements ActionListener
{
    JFrame frame;
    JButton button1,button2,button3,button4,button,button_deposit;
    JLabel Withdraw = new JLabel("Amount Debited!!"),WithdrawError = new JLabel("NOT SUFFICIENT BALANCE");
    JLabel Deposit = new JLabel("Amount Credited!");
    JLabel balancelabel = new JLabel();
    JTextField text = new JTextField();


    ContinueUser()
    {
        frame = new Tools().frame();
        button1 = new JButton("Withdraw");
        button2 = new JButton("Deposit");
        button3 = new JButton("Show Balance");
        button4 = new JButton("EXIT");
        button = new JButton("DONE");
        button_deposit = new JButton("DONE");
        

        button1.setBounds(100,100,100,25);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(100,150,100,25);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(100,200,150,25);
        button3.setFocusable(false);
        button3.addActionListener(this);
        
        button4.setBounds(100,250,100,25);
        button4.setFocusable(false);
        button4.addActionListener(this);

        button.setBounds(360,100,100,25);
        button.setFocusable(false);
        button.addActionListener(this);

        button_deposit.setBounds(360,150,100,25);
        button_deposit.setFocusable(false);
        button_deposit.addActionListener(this);

        Withdraw.setBounds(100,300,200,35);
        Withdraw.setForeground(Color.GREEN);
        Withdraw.setVisible(true);

        WithdrawError.setBounds(100,300,200,35);
        WithdrawError.setForeground(Color.RED);
        WithdrawError.setVisible(true);

        Deposit.setBounds(100,300,200,35);
        Deposit.setForeground(Color.GREEN);
        Deposit.setVisible(true);

        balancelabel.setBounds(100,300,200,35);
        balancelabel.setForeground(Color.black);
        balancelabel.setVisible(true);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button1)
        {
            text.setBounds(230,100,100,25);
            frame.add(button);
            frame.add(text);
        }

        if(e.getSource() == button)
        {
            double amount = Double.valueOf(text.getText());
           
            System.out.println(Calculations.Balance);

            if(Calculations.Balance>10000)
            {
                Calculations.Balance-=amount;
                frame.add(Withdraw);
            }
            else
            {
                frame.add(WithdrawError);
            }

            frame.remove(button);
            frame.remove(text);
        }

        if(e.getSource() == button2)
        {
            text.setBounds(230,150,100,25);
            frame.add(text);
            frame.add(button_deposit);
        }

        if(e.getSource() == button_deposit)
        {
            double add = Double.valueOf(text.getText());

            Calculations.Balance += add;

            frame.add(Deposit);

            frame.remove(text);
            frame.remove(button_deposit);
        }

        if(e.getSource() == button3)
        {
            balancelabel.setText(Calculations.Balance+"");
            frame.add(balancelabel);
        }

        if(e.getSource() == button4)
        {
            System.exit(0);
        }
    }
}