
/* carOwner Class */

public class carOwner
{
    public static void main(String[] args) 
    {
        Car c = new Car();

        System.out.println();
        c.start();
        System.out.println("Price --> "+c.drive(10));
        c.stop();

        jamesBondCar jb = new jamesBondCar();

        System.out.println();
        jb.start();
        System.out.println("Price (James Bond Car)--> "+jb.drive(10));
        jb.stop();
    }
}
