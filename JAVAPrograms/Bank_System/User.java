import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class User implements ActionListener
{
    JButton b;
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    User()
    {}
    
    User(JFrame frame)
    {
        frame.dispose();
        Login i = new Login();
        i.set_User();
        i = new Login(loginInfo);
    }

    void Continue(JFrame frame)
    {
        b = new JButton("Click Here to Continue!");
        b.setBounds(125,330,200,25);
        b.setFocusable(false);
        b.addActionListener(this);

        frame.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == b)
        {
            new ContinueUser();
        }
    }
}
