import java.util.*;
public class Set_2_Question_8 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s1,s2;
        int choice;

        System.out.println("Enter First String (S1)-->");
        s1=in.nextLine();
        
        System.out.println("Enter Second String (S2)-->");
        s2=in.nextLine();

        System.out.println("Enter 1 to Compare S1 to S2");
        System.out.println("Enter 2 to Compare S2 to S1");
        choice=in.nextInt();

        switch (choice) {
            case 1:
            System.out.println(s1.compareTo(s2));
            break;

            case 2:
            System.out.println(s2.compareTo(s1));
            break;

            default:
            System.out.println("Enter Correct Choice!");
            break;
        }
        
        in.close();
    }
}
