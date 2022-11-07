// Java Program to Illustrate NotSerializableException
// where No Exception is Thrown Using Serializable interface
 
// Importing input output class
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
// By implementing Serializable interface
// we are allowing Student object to
// be stored in TestFile.txt
 
// Class 1
// Helper class extending to Serializable interface
class Student implements Serializable {
 
    // Member variables of this class
    int id;
    String name;
 
    // Constructor of this class
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
 
// Class 2
// Main class
class Persist {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // try block to check for exceptions
        try {
 
            // Creating the object
            Student s1 = new Student(007, "Test");
 
            // Creating stream and writing the object
            FileOutputStream fout
                = new FileOutputStream("TestFile.txt");
            ObjectOutputStream out
                = new ObjectOutputStream(fout);
 
            out.writeObject(s1);
            out.flush();
 
            // Closing the stream to free up memory space
            // using close() method
            out.close();
 
            // Display command to shown proper execution of
            // a program
            System.out.println(
                "Object stored successfully");


            ObjectInputStream in = new ObjectInputStream(new FileInputStream("TestFile.txt"));
            
            Student x = (Student) in.readObject();

            System.out.println(x.name);
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
 
            // Print and display the exception on the
            // console
            System.out.println(e);
        }
    }
}
