/**
 * object_refrence
 */
public class object_refrence 
{
    int a,b;
    public static void main(String[] args) 
    {
        object_refrence x,y;

        x=new object_refrence();
        y=new object_refrence();

        System.out.println("\n"+x+"\n"+y);
        
        x.a=10;
        x.b=20;

        y.a=30;
        y.b=40;

        System.out.println("\n\nFor Object A -->\n"+x.a+" "+x.b+"\n"+"\nFor obejct B-->\n"+y.a+" "+y.b);

        x=y;

        System.out.println("\n"+x+"\n"+y);
        System.out.println("\n\nFor Object A -->\n"+x.a+" "+x.b+"\n"+"\nFor obejct B-->\n"+y.a+" "+y.b);

        x.a=5;
        x.b=6;

        System.out.println("\n\nFor Object A -->\n"+x.a+" "+x.b+"\n"+"\nFor obejct B-->\n"+y.a+" "+y.b);

        
    }
}