package Question_1;

import Question_1.university.*;
class Academic2
{
    public static void main(String args[])
    {
        System.out.println("---------------------------- INSIDE ACADEMIC CLASS (OUTSIDE PACKAGE) ----------------------------");
        
        Academic a = new Academic();
        a.main(args);
    }
}