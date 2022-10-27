import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Moderator implements ActionListener
{
    JButton b;
    JFrame frame;
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    
    Moderator()
    {}

    Moderator(JFrame frame)
    {
        frame.dispose();
        Login i = new Login();
        i.set_Moderator();
        i = new Login(loginInfo);
    } 

    void Continue(JFrame frame)
    {
        b = new JButton("Click Here to Continue!");
        b.setBounds(125,330,200,25);
        b.setFocusable(false);
        b.addActionListener(this);

        frame.add(b);
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == b)
        {
            frame.dispose();
            new ContinueModerator();
        }
    }
}
