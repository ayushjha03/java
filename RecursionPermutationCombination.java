import java.util.ArrayList;
public class RecursionPermutationCombination {
    public static void main(String[]args)
    {
// subseq("","abcd");
// System.out.println(subseq1("","abc"));
// subseqascii("","abcd");
// System.out.println(subseqascii1("","abc"));
// permutation("","abc");
// System.out.println(permutation1("","1234"));
System.out.println(count("","1234"));
    }
    static void subseq(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        // take it 
        subseq(p+ch,up.substring(1));
        // ignore it
        subseq(p,up.substring(1));

    }
    // using arraylist
    static ArrayList<String> subseq1(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        // take it
        ArrayList<String> left=subseq1(p+ch,up.substring(1));
        // ignore it
        ArrayList<String> right=subseq1(p,up.substring(1));
        left.addAll(right);
        // or right.addAll(left);
        return left;
    }
    static void subseqascii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return ;
        }
        char ch=up.charAt(0);
        subseqascii(p,up.substring(1));
        subseqascii(p+ch,up.substring(1));
        subseqascii(p+ch+0,up.substring(1));
    }
    static ArrayList<String> subseqascii1(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=subseqascii1(p+ch,up.substring(1));
        ArrayList<String> second=subseqascii1(p,up.substring(1));
        ArrayList<String> third=subseqascii1(p+ch+0,up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    static void permutation(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutation1(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
           ans.addAll((permutation1(f+ch+s,up.substring(1))));
        }
        return ans;

    }
    static int count(String p,String up)
    {

        if(up.isEmpty())
        {
            return 1;
        }
        int c=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            c=c+count(f+ch+s,up.substring(1));
        }
        return c;
    }
}
