package homeworkweek6;

public class Program1
{
    int a = 10; // instance or global variable
    String b= "Hello"; // instance variable

    public static void main(String[] args)
    {
        Program1 p1 = new Program1(); // class object
        p1.test();
    }

    public void test() // instance method
    {
        System.out.println("1st value: "+a);
        System.out.println("2nd value: "+b);

    }




}
