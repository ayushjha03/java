public class Fibonacci {
    // public static void main(String[]args)
    // {
    //    System.out.println( Fibo(5));

    // }
    // static int Fibo(int n)
    // {
    //     if(n<2)
    //     {
    //        return n; 
    //     }
    //     else{
    //         return Fibo(n-1)+Fibo(n-2);
    //     }
    // }
    public static void main(String[]args)
    {
    //     int []a={1,2,3,4,5};
    //     int t=6;
    //    System.out.println( Bs(a,t,0,a.length-1));
    int n=20;int n1=0;;
    int n2=1;int n3;
    System.out.print(n1 + " " + n2 + " ");
    for(int i=3;i<=n;i++)
    {
        
        
        n3=n1+n2;
        System.out.print( n3+ " ");
        n1=n2;
        n2=n3;    
        

    }


    }
    // static int Bs(int []a,int t, int s,int e)
    // {
    //     if(s>e)
    //     {
    //         return -1;
    //     }
    //     int m=s+(e-s)/2;
    //     if(a[m]==t)
    //     {
    //         return m;
    //     }
    //     if(t<a[m])
    //     {
    //         return Bs(a,t,s,m-1);
    //     }
    //     return Bs(a,t,m+1,e);

    // }

}
