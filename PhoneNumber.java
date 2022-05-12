import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[]args)
    {
        // phonepad("","23");
        // System.out.println(Pad("","23"));
        System.out.println(count("","236"));

    }
    static void phonepad(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            phonepad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> Pad(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();  
        list.add(p);
    return list;     }
    
    int digit=up.charAt(0)-'0';
    ArrayList<String> list1= new ArrayList<> ();
    for(int i=(digit -1)*3;i<digit*3;i++)
    {
        char ch=(char)('a'+i);
list1.addAll(Pad(p+ch,up.substring(1)));

    }
    return list1;

}
static int count(String p, String up)
{
    if(up.isEmpty())
    {
        return 1;
    }
    int c=0;
    int digit=up.charAt(0)-'0';
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
        char ch=up.charAt(0);
        c=c+count(p+ch,up.substring(1));
    }
    return c;
}
}
