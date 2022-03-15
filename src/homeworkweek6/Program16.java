package homeworkweek6;

public class Program16
{

    public static void main(String[] args)
    {

        // two binary numbers in string format
        String binaryNumber1 = "10", binaryNumber2 = "11";

        // converting strings into binary format numbers
        int integer1 = Integer.parseInt(binaryNumber1,2);
        int integer2 = Integer.parseInt(binaryNumber2,2);

        // adding two integers
        int output = integer1 + integer2;

        // converting final output back to Binary Integer
        System.out.println("sum of two binary number is: "+Integer.toBinaryString(output));

    }


    }


