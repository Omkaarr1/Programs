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
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    }
}