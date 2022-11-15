import java.io.*;

public class inheritance
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        File file = new File("first.txt");
        inherti i = new inherti(),j;

        // FileWriter writer = new FileWriter(file);

        // writer.write("Hello World\n");
        // writer.write("Welcome\n");
        // writer.close();

        // FileReader reader = new FileReader(file);
        
        // int i=reader.read();

        // while(i!=-1)
        // {
        //     System.out.print((char)i);
        //     i=reader.read();
        // }

        // BufferedReader reader2 = new BufferedReader(new FileReader(file));

        // System.out.println(reader2.readLine());
        // System.out.println(reader2.readLine());
    
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file));

        obj.writeObject(i);
        obj.close();

        ObjectInputStream objRead = new ObjectInputStream(new FileInputStream(file));
        j = (inherti) objRead.readObject();
        
    }    
}