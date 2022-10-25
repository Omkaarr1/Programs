import java.util.*;

public class IDPassword 
{
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDPassword()
    {
        loginInfo.put("0","0");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
