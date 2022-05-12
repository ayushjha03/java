import java.util.ArrayList;
import java.util.Arrays;
public class Practice {
    public static void main(String[]args)
    {
        // int a=5;
        // int b=6;

        // System.out.println(a+b);
        // System.out.println(Substring("","abcd"));
        // SetMatch("","abcappledef");
        int []a={3,5,2,1,4};
        Cyclic(a);
        System.out.println(Arrays.toString(a));
    }
    static ArrayList<String> Substring(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String> f= Substring(p,up.substring(1));
       ArrayList<String> s=  Substring(p+ch,up.substring(1));
        f.addAll(s);
        return f;
    }
    static void SetMatch(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple"))
        {
            SetMatch(p,up.substring(1));
        }
        SetMatch(p+ch,up.substring(1));
    }
    static void Sort(int[]a)
    {
        if(a.length==0)
        {
            return ;
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            } }
        }
        static void Cyclic(int []a)
        {
            int i=0;
            while(i<a.length)
            {
                int c=a[i]-1;
                if(a[i]!=a[c])
                {
                    int temp=a[i];
                    a[i]=a[c];
                    a[c]=temp;
                }
                else
              { i++;}
            }
        
    }
    

}