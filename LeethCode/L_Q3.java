import java.util.*;

public class L_Q3 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] arr = s.toCharArray();
        for(int i = 0; i<s.length();i++) 
        {
            for (int j = i + 1; j < s.length(); j++) 
            {
                if (arr[i] == arr[j]) {
                    arr[j] = ' ';
                }
            }
        }
            String ss = "";
            for(int i =0; i<s.length();i++){
                if(arr[i]!=' '){
                    ss+=arr[i];
                }
            }
            System.out.println(ss);
        }
}