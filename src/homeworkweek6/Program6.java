package homeworkweek6;

import java.util.Scanner;

public class Program6
{
    static float pi = 3.14f;
    public static void main(String[] args)
    {
        float area;

        Scanner KeyboardInput = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int r = Integer.parseInt(KeyboardInput.nextLine());


        area = pi*r*r;
        System.out.println("Area is : "+area);




    }

}
