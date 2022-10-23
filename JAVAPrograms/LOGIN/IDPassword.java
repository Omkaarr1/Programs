package LOGIN;
import java.util.*;

public class IDPassword 
{
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDPassword()
    {
        loginInfo.put("bro","CODE");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
