package Question_4;


//CIRCLE CLASS

class Circle extends Shapes
{
    String calcArea()
    {
        double r,A=0.0;
        
        System.out.println("Enter Radius -->");
        r=in.nextInt();
        
        A = Math.PI*r*r;
        System.out.println("Area --> "+A);
        
        return "";
    }
    
    String calcPerimeter()
    {
        double r,P=0.0;
        
        System.out.println("Enter Radius -->");
        r=in.nextInt();
        
        P=2*Math.PI*r;
        System.out.println("Perimeter --> "+P);
        
        return "";
    }
}