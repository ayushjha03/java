import java .util.ArrayList;
public class Dice {
   public static void main(String[]args)
   {
System.out.println(dice1("",3,6));
   } 
static void dice(String p, int target )
{
    if(target==0)
    {
        System.out.println(p);
        return;
    }
    for(int i=1;i<=6&&i<=target;i++)
    {
        dice(p+i,target-i);
    }
}
static ArrayList<String> dice1(String p, int target )
{
    if(target==0)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        // System.out.println(p);
        return list;
    }
    ArrayList<String> list=new ArrayList<>();
    for(int i=1;i<=6&&i<=target;i++)
    {
        list.addAll(dice1(p+i,target-i));
    }
    return list;
}
static ArrayList<String> dice1(String p, int target,int face )
{
    if(target==0)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        // System.out.println(p);
        return list;
    }
    ArrayList<String> list=new ArrayList<>();
    for(int i=1;i<=face&&i<=target;i++)
    {
        list.addAll(dice1(p+i,target-i,face));
    }
    return list;
}
}
