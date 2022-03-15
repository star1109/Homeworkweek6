package homeworkweek6;

public class Program3
{
    int a = 10;  // instance variable
    static char b = 'R'; // static variable

    public static void main(String[] args)
    {

        test(); // calling static method directly into main method
        Program3 t1 = new Program3(); // creating object to call instance method into static method
        t1.test1(); // calling the instance method via object
    }

    public static void test() //static method
    {
        Program3 p3 = new Program3(); // created an object to call instance variable "a" into a static method
        System.out.println("This value is from the static method Value 1: " + p3.a ); // to print the value of instance variable a
        System.out.println("This value is from the static method Value 2: " + b ); // to print the value of static variable b
        System.out.println("                " );

    }

    public void test1() // instance method
    {
        System.out.println("This value is from instance method value 1:" + a);
        System.out.println("This value is from instance method value 2:" + Program3.b ); // used a classname to call teh static variable "b"

    }


}
