public class Recursion1 {
    public static void main(String[]args)
    {
        int []a={1,2,6,4,5};
    //   System.out.print(sorted(a,0));
      System.out.print(search(a,7,0));
    }
    static boolean sorted(int []a,int index)
    {
        if(index==a.length-1)
        {
            return true;
        }
         return a[index]<a[index+1]&&sorted(a,index+1);
    }
    static boolean search(int []a,int t,int index)
    {
        if(index==a.length)
        {
            return false;
        }
        return a[index]==t||search(a,t,index+1);
        // if(a[index]==t)
        // {
        //     return true;
        // }
        // else
        // return search(a,t,index+1);
    }
    static int findindex(int []a,int t ,int index)
    {
        if(index==-1)
        {
            return -1;
        }
        if(a[index]==t)
        {
            return index;
        }
        return findindex(a,t,index-1);
    }
}
