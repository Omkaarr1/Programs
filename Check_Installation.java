public class Check_Installation {
    public static void main(String[] args) {
        System.out.println("JAVA Version --> "+System.getProperty("java.version"));

        System.out.println("JAVA Runtime Version --> "+System.getProperty("java.runtime.version"));

        System.out.println("JAVA Home --> "+System.getProperty("java.home"));

        System.out.println("JAVA Vendor --> "+System.getProperty("java.venodr"));

        System.out.println("JAVA Vendor URL--> "+System.getProperty("java.version.url"));

        System.out.println("JAVA Class Path --> "+System.getProperty("java.class.path"));

        add();
    }

    static void add()
    {
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }
}