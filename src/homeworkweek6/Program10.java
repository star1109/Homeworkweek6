package homeworkweek6;

import java.util.Scanner;

public class Program10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // to take user input
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 1 ; i <=10 ; i++) // for loop to repeat the same steps
        {
            //System.out.println( n * i +"="+n );
            System.out.println( n +"*"+ i + "="+ n*i);


        }





    }


}
