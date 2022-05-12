import java.util.Arrays;
public class SelectionSorting{
    public static void main(String[]args)
    {
        int []a={34,23,90,1234,-3241,-123,-99,145};
        Sort(a);
        // for(int i=0;i<a.length;i++)
        // {
        //     // System.out.println("Sorted array is " + a[i]);
           
        // }
        System.out.println(Arrays.toString(a));

    }
    static void Sort(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            int s=0;
            int e=a.length-i-1;
            int c=Larger(a, s,e);
            Swap(a,c,e);


        }
    }
    static int Larger(int []a,int s,int e)
    {
int max=s;
for(int k=0;k<=e;k++)
{
    if(a[max]<a[k])
    {
        max=k;
    }
}
return max;
    }
    static void Swap(int []a,int c,int e)
    {
        int temp=a[c];
        a[c]=a[e];
        a[e]=temp;
    }
}