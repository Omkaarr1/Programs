public class this_keyword 
{
    int a,b; //GLOBAL VARIABLE

    this_keyword() //default constructor
    {
        a=b=0;
        this.print(); // REFERS TO CURRECT OBJECT
    }

    this_keyword(int a)
    {
        //   this();
        //   G L
        this.a=a; // Removes Shadowing
        this.print();
    }
    
    this_keyword(int a,int b) //LOCAL VARIABLE
    {
        this();  // Calls default constructor (reuse)
        this.a=a;
        this.b=b; // Removes Shadowing
        this.print();

    }

    void print()
    {
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) 
    {
          this_keyword x= new this_keyword(); 
          this_keyword y= new this_keyword(1);
          this_keyword z= new this_keyword(1,2);

          
    }
}
