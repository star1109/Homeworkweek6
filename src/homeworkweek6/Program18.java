package homeworkweek6;

import java.util.Scanner;

public class Program18
{
    static int v1; // static variable
    static int v2; // satic variable

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // scanner class to take the input from the user
        System.out.println("enter 1st number: ");
        v1 = sc.nextInt();

        System.out.println("enter 2nd number: ");
        v2 = sc.nextInt();
        Program18 p18 = new Program18(); // object to call the instance method into the static method
        addition();
        substraction();
        p18.multiplication(); // calling instance method via object
        p18.divison();// calling instance method via object
        reminder();





    }

    public static void addition() // static method
    {
        int sum = v1+v2;

        System.out.println(v1+ "+"+ v2 + "= "+ sum );

    }

    public static void substraction() // static method
    {
        int sum = v1-v2;
        System.out.println(v1+ "-"+ v2 + "= "+ sum );
    }

    public void divison() // instance method
    {

        int sum = v1/v2;
        System.out.println(v1+ "/"+ v2 + "= "+ sum );
    }

    public void multiplication() // instance method
    {
        int sum = v1*v2;
        System.out.println(v1+ "*"+ v2 + "= "+ sum);
    }

    public static void reminder()
    {
        int sum = v1%v2;
        System.out.println(v1 +"mod" + v2+ "=" +  sum);
    }
}

