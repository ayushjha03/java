
import java.util.Arrays;
// import java.lang.String;
 class InsertionSort {
    public static void main(String[]args)
    {
        String []a= {"a","c","m","f","x","z"};
        Insertion(a);
        System.out.print(Arrays.toString(a));

    }
    static void Insertion(String []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
           for(int j=i+1;j>0;j--) 
           {
               if(a[j].compareTo(a[j-1])<=0)
               {
                   Swap(a,j,j-1);
               }
               else
               break;
           }
        }
    }
    static void Swap(String []a,int c,int b)
    {
        String temp=a[c];
        a[c]=a[b];
        a[b]=temp;
    }
}
