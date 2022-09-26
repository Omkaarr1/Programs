public class B extends A{
    protected static  A a = new A();
    protected static void main(String[] args) {
        display();
        a.display();
    }

    protected static void display()
    {
        System.out.println("I'm in B");
    }
}
