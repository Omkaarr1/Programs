package Question_4;


//SQUARE CLASS

class Square extends Shapes
{
    String calcArea()
    {
        double a,A=0.0;
        
        System.out.println("Enter Side -->");
        a=in.nextInt();
        
        A=a*a;
        System.out.println("Area --> "+A);
        
        return "";
    }
    String calcPerimeter()
    {
        double a,P=0.0;
        
        System.out.println("Enter Side -->");
        a=in.nextInt();
        
        P=4*a;
        System.out.println("Perimeter --> "+P);
        
        return "";
    }
}