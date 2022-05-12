public class Pattern1 {
    public static void main(String []args)
    {
        int i ;
        int j;
         int r=6;
        for( i=0;i<r;i++)
        {
            for(j=r-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int  i=6;i>=0;i--)
        // {
           
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int  i=0;i<=7;i++)
        // {
           
        //     for(int j=1;j<=7-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=i;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
