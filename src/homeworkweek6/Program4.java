package homeworkweek6;

public class Program4
{
    int a = 10; // instance variable
    int b = 20; // instance variable

    static String text = "Software Testing"; // static variable
    static double d = 1234; // static variable

    public static void main(String[] args)
    {
        Program4 iv = new Program4();
        iv.test();
        test1();


    }

    public void test() // instance method
    {

        System.out.println("value 1: This value is from instance method: " +a );// calling instance variable
        System.out.println("value 2: This value is from instance method: " +b );// calling instance variable
        System.out.println("value 3: This value is from instance method: " + text );// calling static variable via classname
        System.out.println("value 4: This value is from instance method: " + Program4.d);// calling static variable via classname
        System.out.println("                     ");

    }

    public static void test1() // static method
    {
        Program4 p4 = new Program4();
        System.out.println("value 1: This value is from static method: " + p4.a);
        System.out.println("value 2: This value is from static method: " + p4.b);
        System.out.println("value 3: This value is from static method: "+ text); // calling static variable directly
        System.out.println("value 4: This value is from static method: "+d); // calling static variable directly
    }





}
