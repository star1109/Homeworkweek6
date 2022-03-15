package homeworkweek6;

import java.util.Scanner;

public class Program15
{


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in); // to take input from user
        System.out.println("Enter 1st number ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number ");
        int n2 = sc.nextInt();

        int temp; //temperory varisble to store the value of a
        System.out.println("before swaping value of a is: "+ n1);
        System.out.println("before swaping value of b is: "+ n2);

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("==============");
        System.out.println("after swaping value of a: " + n1);
        System.out.println("after swaping value of b: " + n2);





    }


}
