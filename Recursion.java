public class Recursion {
       
    static int s=0;
    static void reverse(int n)
    {
        if(n==0)
        {
            return ;
        }
        int r=n%10;
        s=s*10+r;
    reverse(n/10);
    }
    public static void main(String[]args)
    {
        int n=125;
    //    int b=rev(n);
    //  System.out.println(palindrome(n));
    reverse(n);
     System.out.println((s));
    }
    static int rev(int n)
    {
        int d=(int)(Math.log10(n))+1;
        return helper(n,d);
    }
    static int  helper(int n, int d)
    {
        if(n%10==0)
        {
            return n;
        }
        int r=n%10;
        return r*(int)(Math.pow(10,d-1))+helper(n/10,d-1);
    }
    static  boolean palindrome(int n)
    {
        return n==rev(n);
    }
    
}
