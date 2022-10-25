import javax.swing.*;

public class Tools 
{
    JFrame frame()
    {
        JFrame frame = new JFrame();   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }
}
