class A 
{
    A()
    {
        System.out.println("This is A");
    }
}

class B extends A
{
    B()
    {
        System.out.println("This is B");
    }

    B(int a)
    {
        System.out.println(a);
    }
}

 class C extends B
{
    C()
    {
        System.out.println("This is C");
    } 
}

public class practice
{
    public static void main(String[] args) 
    {
        A a;
        
        a = new A();
        System.out.println();
        a = new B();
        System.out.println();
        a = new C();
    }
}

