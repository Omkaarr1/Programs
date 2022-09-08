public class stack_overflow_error 
{
    static int a=0;
public static void main(String args[]) 
{
    a++;
    call(a);
}   

static void call(int a)
{
    String arr[]={"A"};
    System.out.println(a);
    main(arr);
}
}