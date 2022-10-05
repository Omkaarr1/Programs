import java.util.*;
class Area
{
    Scanner in = new Scanner(System.in);
    double l,b;
    void setDim()
    {
        System.out.println("Enter Length -->");
        l = in.nextDouble();

        System.out.println("Enter Breath -->");
        b = in.nextDouble();
    }

    void getArea()
    {
        System.out.println("Area --> "+l*b);
    }
}

class AreaDemo
{
    public static void main(String[] args) 
    {
        Area a = new Area();
        a.setDim();
        a.getArea();
    }
}