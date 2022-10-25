import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContinueModerator implements ActionListener
{
    JFrame frame;
    JButton setBankIntrest = new JButton("SET BANK INTREST"), setGST = new JButton("SET GST"), setMaxDeposit = new JButton("SET MAX DEPOSIT");
    JTextField SBI , SGST , SMD ;
    JButton done = new JButton("DONE");
    final static Calculations c = new Calculations();

    ContinueModerator()
    {
        frame = new Tools().frame();

        setBankIntrest.setBounds(300,100,200,25);
        setBankIntrest.setFocusable(false);
        setBankIntrest.addActionListener(this);

        setGST.setBounds(300,200,150,25);
        setGST.setFocusable(false);
        setGST.addActionListener(this);

        setMaxDeposit.setBounds(300,300,150,25);
        setMaxDeposit.setFocusable(false);
        setMaxDeposit.addActionListener(this);

        done.setBounds(350,350,100,25);
        done.setFocusable(false);
        done.addActionListener(this);

        SBI = new JTextField();
        SGST = new JTextField();
        SMD = new JTextField();

        SBI.setBounds(150,100,150,25);
        SGST.setBounds(150,200,150,25);
        SMD.setBounds(150,300,150,25);

        frame.add(setBankIntrest);
        frame.add(setGST);
        frame.add(setMaxDeposit);
        frame.add(done);
        frame.add(SBI);
        frame.add(SGST);
        frame.add(SMD);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == setBankIntrest && SBI.getText()!=null)
        {
            c.bankIntrest = Double.valueOf(SBI.getText());
        }
        else
        {
            c.bankIntrest = 25;
        }

        if(e.getSource() == setGST && SGST.getText()!=null)
        {
            c.bankGST = Double.valueOf(SGST.getText());
        }
        else
        {
            c.bankGST = 18;
        } 

        if(e.getSource() == setMaxDeposit && SMD.getText()!=null)
        {
            c.bankMaxDeposit = Double.valueOf(SMD.getText());
        }
        else
        {
            c.bankMaxDeposit = 100000;
        }

        if(e.getSource() == done)
        {
            frame.dispose();
            Initiate i = new Initiate();
        }
    }
}
