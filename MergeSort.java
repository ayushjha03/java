import java.util.Arrays;
public class MergeSort {
  public static void main(String[]args)
  {
      int a[]={5,4,3,2,1};
   int[]  b= mergesort(a);
     System.out.println(Arrays.toString(b));

  }  
  static int []mergesort(int []a){

    if(a.length==1)
    {
        return a;
    }
    int mid=a.length/2;
    int []leftarray=mergesort(Arrays.copyOfRange(a, 0, mid));
    int []rightarray=mergesort(Arrays.copyOfRange(a, mid,a.length));
    return merge(leftarray,rightarray);
  }
  static int[] merge(int[]f,int[]s)
  {
      int []mix=new int[f.length+s.length];
      int i=0;int j=0;int k=0;
      while(i<f.length&&j<s.length)
      {
          if(f[i]<s[j])
          {
              mix[k]=f[i];
              i++;
          }
          else{
              mix[k]=s[j];
              j++;
          }
          k++;
      }
      while(i<f.length)
      {
          mix[k]=f[i];
          i++;
          k++;
      }
      while(j<s.length)
      {
          mix[k]=s[j];
          j++;
          k++;
      }
      return mix;
  }
}
