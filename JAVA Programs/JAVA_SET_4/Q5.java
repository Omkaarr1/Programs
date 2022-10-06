/*

Create a class BankCustomer with instance variables AccNo, UserName and balance.
Add appropriate constructors and methods to deposit and withdraw that update the
balance appropriately. Create an exception class MinBalanceException to be thrown
when the balance of any BankCustomer goes beyond a minimum balance (assume
your own minimum balance). Demonstrate the above classes with array of objects in
main method.
*/

import java.util.*;
class Q5
{
    Scanner in = new Scanner(System.in);
    String Name;
    long AccountNumber;
    double Balance;

    void withdraw() throws BankException
    {
        double balance;

        System.out.println("Enter Amount to be Withdrawn --> ");
        balance = in.nextDouble();

        Balance -= balance;

        if(Balance<10000)
        {
            Balance += balance;
            throw new BankException("Can't Withdraw this Amount!!\nBalance will Go less than 10,000");
        }

        System.out.println("Current Balance --> "+Balance);
    }

    void deposit()
    {
        double deposit;

        System.out.println("Enter Amount to be Deposited --> ");
        deposit=in.nextDouble();

        Balance += deposit;

        System.out.println("Current Balance --> "+Balance);
    }

    public static void main(String[] args) 
    {
        Q6 a = new Q6();
        
        for(;;)
        {
            System.out.println("Enter 1 to Deposit --> \nEnter 2 to Withdraw -->");

                switch (a.in.nextInt())
                {
                    case 1:
                    a.deposit();
                    break;

                    case 2:
                    try
                    {
                        a.withdraw();
                    }
                    catch(BankException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
        }
    }
}