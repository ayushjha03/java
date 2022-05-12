public class Linear 
{
    public static void main(String[]args)
    {
        int a[]={};
        // int t=43;
        LinearS(a);
    }
    static boolean LinearS(int a[])
    {
        //  boolean swap=false;
         if(a.length==0)
         {
             return false;
         }

        else {for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<a.length-i-1;j++)
           {
             if(a[j]>a[j+1])
             {
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                //  swap=true;
                
             }
           }
          
        }}
        for(int k=0;k<a.length;k++)
        {
            System.out.println("sorted array is " + a[k] );   
        }
        //
        return true;
    }
}