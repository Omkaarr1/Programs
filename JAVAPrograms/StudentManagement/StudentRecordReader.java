/**
 * StudentRecordReader.java
 * This program illustrates how to use the DataInputStream class for reading
 * data from a file.
 *
 */

package stuMgmt;

import java.util.*;
import java.io.*;
 

public class StudentRecordReader {
 
    DataInputStream dataInput;
 
    public StudentRecordReader(String inputFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(inputFile));
    }
 
    public Student[] readAll() throws IOException {
        Student [] listStudent = new Student[3];
	int i = 0;
 
        try {
            while (true) {
                String name = dataInput.readUTF();
                boolean gender = dataInput.readBoolean();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();
 
                Student student = new Student(name, gender, age, grade);
                listStudent[i] = student;
		i++;
            }
        } catch (EOFException ex) {
            // reach end of file
        }
 
        dataInput.close();
 
        return listStudent;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String fileName;
        System.out.println("Please provide input file");
        fileName = sc.next();
 
        String inputFile = fileName;
 
        try {
            StudentRecordReader reader = new StudentRecordReader(inputFile);
 
            Student [] listStudent = reader.readAll();
 
            for (Student student : listStudent) {
                System.out.print(student.getName() + "\t");
                System.out.print(student.getGender() + "\t");
                System.out.print(student.getAge() + "\t");
                System.out.println(student.getGrade());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}