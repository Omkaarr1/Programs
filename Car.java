/*(a) Create a new class Car with the following methods:
public void start()
public void stop()
public int drive(int howlong) - The method drive() has to return the total distance
driven by the car for the specified time. Use the following formula to calculate the
distance: Distance = howlong*60;
(b) Write another class CarOwner and that creates an instance of the object Car and
calls its methods. The result of each method call has to be printed using System.out.println().
(c) Create a subclass of Car named JamesBondCar and override the method drive()
there. Use the following formula to calculat e the distance: Distance = howlong*180; */

public class Car 
{
    void start()
    {
        System.out.println("Engine is Running!");
    }

    void stop()
    {
        System.out.println("Engine Stoped!");
    }

    int drive(int howlong)
    {
        return howlong*60;
    }
}
