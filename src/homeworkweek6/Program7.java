package homeworkweek6;
import java.util.Scanner;

public class Program7
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        int f = sc.nextInt();

        int sum1;
        sum1 = f-32;
        float sum2 = 5/9f;
        float ans = sum1 * sum2;

        System.out.println(f + " Fahrenheit is "+ ans + " celsius degree");






    }

}
