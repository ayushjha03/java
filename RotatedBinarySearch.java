// import java.util.Arrays;
public class RotatedBinarySearch{
    public static void main(String[]args)
    {
        int []a={5,8,9,1,2,3};
        int t=1;
        System.out.println(Search(a,t,0,a.length-1));

    }
    static int Search(int []a,int t, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m= s+(e-s)/2;
        if(a[m]==t)
        {
            return m;
        }
        if(a[s]<a[m])
        {
            if(t>=a[s]&&t<=a[m])
            {
 return Search(a,t,s,m-1);
            }
            else{
                return Search(a,t,m+1,e);
            }
        }
        if(t>=a[m]&&t<=a[e])
        {
            return Search(a,t,m+1,e);
        }
        else{
            return Search(a,t,s,m-1);
        }
    }
   
}