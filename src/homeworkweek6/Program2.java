package homeworkweek6;

public class Program2
{
    static int a =10; // static variable
    static float b = 20.5f; // static variable

    public static void main(String[] args)
    {
     test(); // calling the test() method without object because both are static methods
    }


    public static void test() // static method
    {
        System.out.println("1st number: "+ a); // to print the value of variable a
        System.out.println("2nd number:" + b); // to print the value of variable b
    }


}
