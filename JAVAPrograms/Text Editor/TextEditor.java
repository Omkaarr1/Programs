import java.util.*;
import java.util.jar.JarEntry;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel color1 = new JPanel();
    JButton newFile = new JButton("Click Here to Create A New File");
    JButton existingFile = new JButton("Click Here to Edit An Existing File");
    JButton done = new JButton("DONE");
    JButton done2 = new JButton("DONE");
    JLabel welcomeJLabel = new JLabel("Welcome To Text Editor");
    JTextField FileName = new JTextField();
    JLabel filename = new JLabel("Enter The File Name");
    JTextArea textField = new JTextArea();
    FileWriter writer;


    TextEditor()
    {
        newFile.setBounds(50,120,230,20);
        newFile.setBackground(Color.MAGENTA);
        newFile.setForeground(Color.blue);
        newFile.setFocusable(false);
        newFile.addActionListener(this);

        filename.setBounds(50,70,170,30);
        filename.setFont(new Font(null,Font.ITALIC,18));

        FileName.setBounds(230,78,100,20);
        
        existingFile.setBounds(50,150,230,20);
        existingFile.setBackground(Color.MAGENTA);
        existingFile.setForeground(Color.blue);
        existingFile.setFocusable(false);
        existingFile.addActionListener(this);

        welcomeJLabel.setBounds(100,10,300,20);
        welcomeJLabel.setFont(new Font(null,Font.ITALIC,25));

        color1.setBackground(new ColorUIResource(76, 220, 173));
        color1.setBounds(0,0,500,500);

        textField.setBounds(50,200,250,250);

        done.setBounds(360,200,100,30);
        done.setBackground(Color.green);
        done.setForeground(Color.blue);
        done.setFocusable(false);
        done.addActionListener(this);

        done2.setBounds(360,200,100,30);
        done2.setBackground(Color.green);
        done2.setForeground(Color.blue);
        done2.setFocusable(false);
        done2.addActionListener(this);
        
        frame.add(welcomeJLabel);
        frame.add(filename);
        frame.add(newFile);
        frame.add(existingFile);
        frame.add(FileName);
        frame.add(color1);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == newFile)
        {
            frame.add(textField);
            frame.add(done);
            try 
            {
               writer = new FileWriter(FileName.getText()+".txt");
            }
            catch (IOException e1)
            {}
        }

        if(e.getSource() == done)
        {
            try 
            {
                writer.write(textField.getText());
                writer.close();
                frame.dispose();
                new TextEditor();
            } 
            catch (IOException e1) 
            {}
        }

        if(e.getSource() == done2)
        {
            try 
            {
                writer.write(textField.getText());
                writer.close();
                frame.dispose();
                new TextEditor();
            } 
            catch (IOException e1) 
            {} 
        }

        if(e.getSource() == existingFile)
        {
            frame.add(textField);
            frame.add(done);
            try 
            {
                writer = new FileWriter(FileName.getText()+".txt",true);
            } 
            catch (IOException e1) 
            {}
        }
    }

    void setFile(String x) throws IOException
    {
    }
    public static void main(String[] args) 
    {
        new TextEditor();    
    }
}
