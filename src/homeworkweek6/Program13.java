package homeworkweek6;

import java.util.Scanner;

public class Program13
{
    public static void main(String[] args)
    {
        ave(); // calling the ave static method into main method directly
    }
    public  static void ave()
    {
        Scanner sc = new Scanner(System.in); // to take userinput
        System.out.println("Enter 1st number ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number ");
        int n2 = sc.nextInt();

        System.out.println("Enter 3rd number ");
        int n3 = sc.nextInt();

        float sum = (n1+n2+n3)/3; // formula to find average

        System.out.println("average is: "+sum);


    }



}
