
import java.util.ArrayList;

	
	class SubarraySum
{
  //TRY THIS NOTHING FANCY
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
   {
     int sum;
    //  ArrayList<Integer> r=new ArrayList<Integer>();
       for(int i=0;i<n;i++){
            sum=0;
           for(int j=i;j<n-1;j++){
         if(sum>s)
         break;
         sum=sum+arr[j];
         
         if(sum==s){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i+1,j+1);
                return list;}
           }
   }
   ArrayList<Integer> list=new ArrayList<>();
                list.add(-1);
                return list;
   
}
public static void main(String [] args)
{
    int []a={1,2,3,4,5,6};
    int n=6;
    int s=15;
    System.out.println(subarraySum(a,n,s));
}
}

