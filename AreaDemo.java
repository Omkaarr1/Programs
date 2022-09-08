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
    double getArea()
    {
        return l*b;
    }
}

class AreaDemo
{
    public static void main(String[] args) 
    {
        Area a = new Area();
        a.setDim();
        System.out.println("Area --> "+a.getArea());
    }
}