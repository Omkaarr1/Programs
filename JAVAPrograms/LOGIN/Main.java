package LOGIN;
public class Main
{
    public static void main(String[] args) 
    {
        IDPassword idPassword = new IDPassword();
        Login login = new Login(idPassword.getLoginInfo());
    }
}