import java.util.ArrayList;
import java.util.Arrays;
public class Maze {
    public static void main(String []args)
    {
// System.out.println(count(3,3));
// System.out.println(count1("",3,3));
// System.out.println(count2("",3,3));
boolean [][]a={{true,true,true},{true,true,true},{true,true,true}};
int [][]path=new int [a.length][a[0].length];
allpathprint("",a,0,0,path,0);
    }
    static int  count( int r, int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int down=count(r-1,c);
        int right = count(r,c-1);
        return down+right;
    }
    static ArrayList<String> count1(String p,int r, int c)
    {
        if(r==1||c==1)
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1)
        {
            list.addAll(count1(p+'D',r-1,c));

        }
        if(c>1)
        {
            list.addAll(count1(p+'R',r,c-1));

        }
       
        return list;
    }
    static ArrayList<String> count2(String p,int r, int c)
    {
        if(r==1||c==1)
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1)
        {
            list.addAll(count2(p+'D',r-1,c));

        }
        if(c>1)
        {
            list.addAll(count2(p+'R',r,c-1));

        }
        if(r>1&&c>1)
        {
            list.addAll(count2(p+'D',r-1,c-1));
        }
       
        return list;
    }
    static void mazeobstacle(String p, boolean[][]a,int r, int c)
    {
if(r==a.length-1&&c==a[0].length-1)
{
    System.out.println(p);
    return;
}
if(a[r][c]==false)
{
    return;
}
if(r<a.length-1)
{
    mazeobstacle(p+'D',a,r+1,c);
}
if(c<a[0].length-1)
{
    mazeobstacle(p+'R',a,r,c+1);
}
  
    }
    static void allpath(String p,boolean[][]a,int r,int c)
    {
        if(r==a.length-1&&c==a[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(a[r][c]==false)
        {
            return;
        }
        a[r][c]=false;
        if(r<a.length-1)
        {
            allpath(p+'D',a,r+1,c);
        }
        if(c<a[0].length-1)
        {
            allpath(p+'R',a,r,c+1);
        }
        if(r>0)
        {
            allpath(p+'U',a,r-1,c);
        }
        if(c>0)
        {
            allpath(p+'L',a,r,c-1);
        }
        a[r][c]=true;
    }

    static void allpathprint(String p, boolean[][]a,int r, int c,int [] []path,int step)
    {
if(r==a.length-1&&c==a[0].length-1)
{
    a[r][c]=false;
    path[r][c]=step;
    for(int []arr: path)
    {
       System.out.println(Arrays.toString(arr));
    }
    System.out.println(p);
    return;
}
if(a[r][c]==false)
{
    return;
}
if(r<a.length-1)
{
    allpathprint(p+'D',a,r+1,c,path,step+1);
}
if(c<a[0].length-1)
{
    allpathprint(p+'R',a,r,c+1,path,step+1);
}
if(r>0)
{
    allpathprint(p+'U',a,r-1,c,path,step+1);
}
if(c>0)
{
    allpathprint(p+'L',a,r,c-1,path,step+1);
}
a[r][c]=true;
path[r][c]=0;
  
    }
    static void allpath1(String p,boolean[][]a,int r,int c)
    {
        if(r==a.length-1&&c==a[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(a[r][c]==false)
        {
            return;
        }
        a[r][c]=false;
        if(r<a.length-1)
        {
            allpath(p+'D',a,r+1,c);
        }
        if(c<a[0].length-1)
        {
            allpath(p+'R',a,r,c+1);
        }
        if(r>0)
        {
            allpath(p+'U',a,r-1,c);
        }
        if(c>0)
        {
            allpath(p+'L',a,r,c-1);
        }
        a[r][c]=true;
    }
}
