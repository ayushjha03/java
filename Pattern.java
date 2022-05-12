public class Pattern {
    public static void main(String []args)
    {
        for(int i=0;i<6;i++)
        {
            // int t=i>5?(2*5-i):i;
            for(int j=2*(6-i);j>=0;j--)
            {
                
                // if(j<(8-i))
                // {
                //     System.out.print("*");
                    
                // }
                
                
                    System.out.print(""); 
                }
                // if(j>(5-i))
                // {
                //     System.out.print("");
                // }
                // else
                // if(j<i)
                // {
                //     System.out.print("*");
                // }
                
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
           
        
    }
    
}
