
import java.awt.Font;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.crypto.Data;

import java.util.*;

public class Welcome implements ActionListener
{
    JFrame frame = new JFrame();
    JFrame OriginalFrame;
    JLabel welcomeLable = new JLabel("Hello and Welcome");
    JButton button = new JButton("Click to Know the Number of Account's");
    JButton button2 = new JButton("Click Here to Continue!");
    HashMap<String,String> DATA = new HashMap<String,String>();

    Welcome(HashMap<String,String> DATA,JFrame frame)
    {
        this.DATA = DATA;
        OriginalFrame = frame;
    }

    void activate()
    {
        welcomeLable.setBounds(0,0,150,150);
        welcomeLable.setFont(new Font(null,Font.PLAIN,15));

        button.setBounds(125,100,350,25);
        button.setFocusable(false);
        button.addActionListener(this);
        
        button2.setBounds(125,150,300,25);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame.add(welcomeLable);
        frame.add(button);
        frame.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            OriginalFrame.dispose();
            print();
        }    

        if(e.getSource() == button2)
        {
            OriginalFrame.dispose();
            frame.dispose();
            Continue c = new Continue();
        }
    }

    void print()
    {
        frame.dispose();
        int x=100,y=100;
        JFrame frame = create();

        for(String key: DATA.keySet())
        {
            JLabel label = new JLabel();
            label.setBounds(x,y,50,50);
            label.setText(DATA.get(key));
            frame.add(label);
            label.setHorizontalAlignment(0);
            label.setVerticalAlignment(0);
            y+=50;
        }
    }

    JFrame create()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }
}
