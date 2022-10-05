package Question_4;


//CLASS RECTANGLE

class Rectangle extends Shapes
{
    String calcArea()
    {
        double a,b,A=0.0;
        
        System.out.println("Enter Length -->");
        a=in.nextInt();
        
        System.out.println("Enter Breath -->");
        b=in.nextInt();
        
        A = a*b;
        System.out.println("Area --> "+A);
        
        return "";
    }
    String calcPerimeter()
    {
        double a,b,c,d,P=0.0;
        
        System.out.println("Enter Length -->");
        a=in.nextInt();
        
        System.out.println("Enter Breath -->");
        b=in.nextInt();
        
        P=2*(a+b);
        
        System.out.println("Perimeter --> "+P);
        
        return "";
    }
}