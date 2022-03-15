package homeworkweek6;

import java.util.Scanner;

public class Program8
{
    public static void main(String[] args)
    {
        float area;
        float base;
        float height;

        Scanner sc = new Scanner(System.in);  // to take user input
        System.out.println("Enter base: ");
        base = sc.nextInt();

        System.out.println("Enter height: ");
        height = sc.nextInt();

        area = 0.5f*base*height; // formula to find area

        System.out.println("Area of triangle is: "+ area);



    }


}
