package Question_4;

//TRIANGLE CLASS

class Triangle extends Shapes
{
    String calcArea()
    {
        double a,b,c,s,A=0;
        
        System.out.println("Enter Value of A -->");
        a=in.nextInt();
        
        System.out.println("Enter Value of B -->");
        b=in.nextInt();
        
        System.out.println("Enter Value of C -->");
        c=in.nextInt();
        
        s=(a+b+c)/2;
        
        A = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area --> "+A);
        
        return "";
    }
    
    String calcPerimeter()
    {
        double a,b,c,P=0;
        
        System.out.println("Enter Value of A -->");
        a=in.nextInt();
        
        System.out.println("Enter Value of B -->");
        b=in.nextInt();
        
        System.out.println("Enter Value of C -->");
        c=in.nextInt();
        
        P = a+b+c;
        
        System.out.println("Perimeter --> "+P);
        
        return "";
    }
}