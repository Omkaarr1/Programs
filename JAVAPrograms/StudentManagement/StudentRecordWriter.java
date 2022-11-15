/**
 * StudentRecordWriter.java
 * This program illustrates how to use the DataOutputStream class for writing
 * data to a file.
 *
 */

package stuMgmt;

import java.util.*;
import java.io.*;
 
public class StudentRecordWriter {
    DataOutputStream dataOutput;
 
    public StudentRecordWriter(String outputFile) throws IOException {
        dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
    }
 
    public void write(Student student) throws IOException {
        dataOutput.writeUTF(student.getName());
        dataOutput.writeBoolean(student.getGender());
        dataOutput.writeInt(student.getAge());
        dataOutput.writeFloat(student.getGrade());
    }
 
    public void save() throws IOException {
        dataOutput.close();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String fileName;
        System.out.println("Please provide output file");
        fileName = sc.next();
         
	Student stu[] = new Student[3];        

	stu[0] = new Student("Alice", false, 23, 80.5f);
	stu[1] = new Student("Brian", true, 22, 95.0f);
	stu[2] = new Student("Carol", false, 21, 79.8f);

        try {
            StudentRecordWriter writer = new StudentRecordWriter(fileName);
 
            for (Student student : stu) {
                writer.write(student);
            }
 
            writer.save();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}