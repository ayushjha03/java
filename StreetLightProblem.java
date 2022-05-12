import java.util.Scanner;
public class StreetLightProblem {
   public static void main(String []args)
   {
       int []a=new int[5];
       Scanner d =new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
           a[i]=d.nextInt();
       }
       int days=3;
       int []b= new int[5];
       for(int i=1;i<=days;i++)
       {
           for(int j=0;j<5;j++)
           {
               if(j==0)
               {
                  

                   if(a[j+1]==0)
                   {
                       b[j]=0;
                   }
                   else{
                       b[j]=1;
                   }
               }
            else  if (j==4)
               {
                   
 
                    if(a[j-1]==0)
                    
                    {
                        b[j]=0;
                    }
                    else{
                        b[j]=1;
                    }
                }
            //  else if (j>0||j<4)  
            else{
                if(a[j-1]==0&&a[j+1]==0||a[j-1]==1&&a[j+1]==1)
                {
                    b[j]=0;
                }
                else{
                    b[j]=1;
                }
               }
              
           }
       }
       for(int k=0;k<5;k++)
       {
           System.out.print(b[k] + " ");
       }
       
   } 
}
