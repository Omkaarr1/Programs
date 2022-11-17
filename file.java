import java.io.*;
/*
 * 
 * FileInputStream
 * FileOutStream
 * BufferedWriter
 * DataInputStream
 * DataOutputStream
 * ObjectInputStream
 * ObjectOutputStream
 */


public class file 
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("information.txt");

        FileWriter writer = new FileWriter(file);

        writer.write("Srinjoy Sarkar");
        writer.write("\nWlecome\n");
        writer.close();

        writer = new FileWriter(file,true);
        writer.write("Wlecome");
        writer.write("\nSrinjoy Sarkar");
        writer.close();

        FileReader reader = new FileReader(file);

        int i=reader.read();

        while(i!=-1)
        {
        System.out.print((char)i);
        i=reader.read();
        }

        System.out.println();

            
    }
}
