public class Classes {
    int a;
    String name;
    double marks;
     Classes(int b, String Name, double Marks){
        a=b;
        name=Name;
        marks=Marks;

    }
    static double  average()
    {
        double  a=98.2;
        double b=95.3;
        double   c=99.1; double  d=97.9; double  e=96.5;
        double avg=(a+b+c+d+e)/5;
        return avg;
    }
    
  
}
class Try extends Classes{
    int  value;
   public   Try(int val,int a, String name, double marks)
    {
        super(a, name, marks);
this.value=val;
    }

    public static void main (String []args)
    {
        // Classes obj1=new Classes(1,"Ram",98.2);
        // Classes obj2=new Classes(2,"Balram",95.3);
        // Classes obj3=new Classes(3,"Brahma",99.1);
        // Classes obj4=new Classes(4,"Mahadev",97.9);
        // Classes obj5=new Classes(5,"Vishnu",96.5);

        Try obj=new Try(125,5,"Vishnu", 96.5);
        System.out.println(obj.a + " "+ obj.name + " " + obj.marks+ " " + obj.value );
        // System.out.println(average());
        // System.out.println(obj1.a + " "+ obj1.name + " " +obj1.marks);
        // System.out.println(obj2.a +" "+  obj2.name +" "+ obj2.marks);
        // System.out.println(obj3.a +" "+ obj3.name +" "+ obj3.marks );
        // System.out.println(obj4.a +" "+ obj4.name +" "+ obj4.marks );
        // System.out.println(obj5.a +" "+ obj5.name +" "+ obj5.marks);
    }
}

