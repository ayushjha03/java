// import java.util.Arrays;
// import java.util.Scanner;
public class Array {

    public static void main(String[]args)
	    {
	        int a[]={3,4,5,67,89};
	        int t=4;
	      
	     int ans=  Binary(a,t);
	        System.out.println(ans);
	    }
	        static int Binary(int []a,int t)
	        {
	            int s=0;
	            int e=a.length-1;
	           
	            while(s<=e)
	            {
	            	 int m=s+(e-s)/2;
	                
	                if(t<a[m])
	                {
	                    e=m-1;
	                }
	                else if(a[m]<t) {
	                    s=m+1;
	                }
	                else
	                {
	                	System.out.println("target is at index" );
	                    return m;
	                }
	              
	            }
	            return -1;
//	            System.out.println("target not found");
	        }

    
}
