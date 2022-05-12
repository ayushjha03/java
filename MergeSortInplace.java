import java.util.Arrays;
public class MergeSortInplace {
    public static void main(String[]args)
    {
        int a[]={5,4,3,2,1};
        int s=0;
        int e=a.length-1;
     mergesortinplace(a,s,e);
       System.out.println(Arrays.toString(a));
  
    }  
    static void mergesortinplace(int []a,int s,int e)
    {
        if(a.length==1)
    {
        return ;}
        int m=(s+e)/2;
        mergesortinplace(a,s,m);
        mergesortinplace(a,m,e);
        mergeinplace(a,s,m,e);
    
    }
    static void mergeinplace(int []a,int s,int m,int e)
    {
        int []mix=new int[e-s];
        int i=s;int j=m;int k=0;
        while(i<m&&j<e)
        {
            if(a[i]<a[j])
            {
                mix[k]=a[i];
                i++;
            }
            else{
                mix[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            mix[k]=a[i];
            i++;
            k++;
        }
        while(j<e)
        {
            mix[k]=a[j];
            j++;
            k++;
        }
        for(int p=0;p<mix.length;p++)
        {
            a[s+p]=mix[p];
        }
    }
}
