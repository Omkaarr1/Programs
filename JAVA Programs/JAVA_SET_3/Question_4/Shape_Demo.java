package Question_4;

class Shape_Demo
{
    public static void main(String args[])
    {
        Triangle T = new Triangle();
        Circle C = new Circle();
        Square S = new Square();
        Rectangle R = new Rectangle();
        
        System.out.println("Perimeter of Square -->"+S.calcPerimeter());
        
        System.out.println("Area of Square --> "+S.calcArea());
        
        System.out.println("Perimeter of Rectangle -->"+R.calcPerimeter());
        
        System.out.println("Area of Rectangle -->"+R.calcArea());
        
        System.out.println("Perimeter of Circle -->"+C.calcPerimeter());
        
        System.out.println("Area of Circle -->"+C.calcArea());
        
        System.out.println("Perimeter of Triangle -->"+T.calcPerimeter());
        
        System.out.println("Area of Triangle -->"+T.calcArea());
    }
}