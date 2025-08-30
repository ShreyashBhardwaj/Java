public class Program_3 {
    String Name;
    int age;
    double percentage;
    void set(String stuname,int stuage,double stupercentage)
    {
        Name=stuname;
        age=stuage;
        percentage=stupercentage;
    }
    String getName()
    {
        return Name;
    }
    int getRoll()
    {
        return age;
    }
    double getpercent()
    {
        return percentage;
    }

    public static void main(String args[])
    {
        Program_3 ob=new Program_3();
        ob.set("Sam",21,60);
        System.out.println("Name="+ob.getName());
        System.out.println("Age="+ob.getRoll());
        System.out.println("Percentage="+ob.getpercent());
    }


}
