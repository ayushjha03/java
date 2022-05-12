// import java.util.Arrays;


public class BinarySearching {
    public static void main(String[]args)
    {
        int []a={1,2,3,4,5};
        int t=5;
        int s=0;int e=a.length-1;
        int ans= Binary(a,t,s,e);
        // for(int i=0;i<a.length;i++)
        // {
        //     // System.out.println("Sorted array is " + a[i]);
           
        // }
        System.out.println(ans);


    }
    static int Binary(int []a,int t,int s,int e)
    {
    
       
        
        while(s<e-1)
        {
            int  m=s+(e-s)/2;
           
            

                if (a[m]==a[t])
                {
                    return m;
                }
                else if(a[m]<t)
                {
                    return Binary(a,t,s,m-1);
                }
                else {
                    return Binary(a,t,m+1,e);
                }
            } 
                
               
           return -1; 

        }
    
}
