import java.util.*;
class Triangle 
{
    Scanner in = new Scanner(System.in);
    double a,b,c;
    
    Triangle()
    {
        a=b=c=0;
    }

    Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    void input()
    {
        double a,b,c;

        System.out.println("Enter Value of A --> ");
        a=in.nextDouble();
        
        System.out.println("Enter Value of B --> ");
        b=in.nextDouble();
        
        System.out.println("Enter Value of C --> ");
        c=in.nextDouble();
        
        this.a=a;
        this.b=b;
        this.c=c;
    }

    void area()
    {
        double s,A;
        s=(a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area --> "+A);
    }

    void perimeter()
    {
        double P = a+b+c;

        System.out.println("Perimeter --> "+P);
    }
}

class TriangleDemo
{
    public static void main(String[] args) 
    {
        Triangle t = new Triangle();
        
        t.input();
        t.area();
        t.perimeter();

        t = new Triangle(10,11,12);
        t.area();
        t.perimeter();
    }
}