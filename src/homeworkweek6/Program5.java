package homeworkweek6;

import java.util.Scanner;

public class Program5
{
    static int v1;
    static int v2;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
         v1 = sc.nextInt();

        System.out.println("enter 2nd number: ");
         v2 = sc.nextInt();

        addition();
        substraction();

        Program5 p5 = new Program5();
        p5.divison();
        p5.multiplication();

    }

    public static void addition() // static method
    {
        int sum = v1+v2;

        System.out.println("Addition of numbers is: " + sum );

    }

    public static void substraction() // static method
    {
        int sum = v1-v2;
        System.out.println("Substraction of numbers is: "+ sum);
    }

    public void divison() // instance method
    {

        int sum = v1/v2;
        System.out.println("Division of numbers is: "+ sum);
    }

    public void multiplication() // instance method
    {
        int sum = v1*v2;
        System.out.println("Multiplication of numbers is: "+ sum);
    }
}
