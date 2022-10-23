import java.util.*;

class Customer 
{
    Scanner in;    
    int id,discount;
    String name;
    
    int getID()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    int getDiscount()
    {
        return discount;
    }

    void setDiscount()
    {
        int sd;

        System.out.println("Enter Discount -->");
        sd=new Scanner(System.in).nextInt();

        discount=sd;
    }

    String tostring()
    {
        return name+" "+id+" "+discount+"% ";
    }
}

class Invoice
{
    Scanner in = new Scanner(System.in);
    int id;
    Customer customer;
    double amount;

    Invoice(Customer c,double a)
    {
        customer=c;
        amount=a;
    }

    String getID()
    {
        return id+"";
    }

    void setID()
    {
        int id;

        System.out.println("Enter Invoice ID -->");
        id=in.nextInt();
        this.id=id;
    }

    Customer getCustomer()
    {
        return customer;
    }

    void setCustomer(Customer c)
    {
        customer = c;
    }

    double getAmount()
    {
        return amount;
    }

    void setAmount()
    {
        double a;

        System.out.println("Enter Amount -->");
        a=new Scanner(System.in).nextDouble();

        amount=a;
    }

    String getCustomerID()
    {
        return customer.getID()+"";
    }

    String getCustomerName()
    {
        return customer.tostring();
    }

    int getCustomerDiscount()
    {
        return customer.getDiscount();
    }

    double getAmountAfterDiscount()
    {
        double a;
        int d;

        a=getAmount();
        d=getCustomerDiscount();

        a=a-((a*d)/100);

        return a;
    }

    String tostring()
    {
        return "Invoice[id = "+getID()+" Customer = "+getCustomerName()+" Amount = "+getAmountAfterDiscount()+"]";
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Customer c = new Customer();
        Invoice i = new Invoice(c,0);
        int cid;
        String cname;

        i.setID();

        System.out.println("Enter Customer Name -->");
        cname=in.nextLine();

        System.out.println("Enter Customer ID -->");
        cid=in.nextInt();

        c.id=cid;
        c.name=cname;
        
        i.setCustomer(c);
        i.setAmount();
        c.setDiscount();

        System.out.println(i.tostring());

        in.close();
    }   
}