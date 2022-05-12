import java.util.Arrays;
public class CyclicSort {
    public static void main(String[]args)
    {
        int []a={6,4,10,12,8,5,11,7,9};

        Cyclic(a);
        System.out.print(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=i+4)
            {
                System.out.println("missing number is " + (i+4));
             } 
            //  else
            // System.out.println("no missing number");
        }

    }
    static void Cyclic(int []a)
    {
       int i=0;
       while(i<a.length-1)
       {
int correct =a[i]-4;
if(a[i]!=a[correct])
{
    Swap(a,i,correct);
}
else{
    i++;
}
       }
    }
    static void Swap(int []a,int c,int b)
    {
        int temp=a[c];
        a[c]=a[b];
        a[b]=temp;
    }
}
