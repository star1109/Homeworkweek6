package homeworkweek6;

public class Program14 {

    public static void main(String[] strings) {

        float width = 5.6f;
        float height = 8.5f;

        float perimeter = 2 * (height + width); // formula to find the perimeter

        float area = width * height; // formula to find area

        // to see the output in console
        System.out.println("Area is " + width + "*"+ height + "= " + area);
        System.out.println("Perimeter is 2 * "+ "("+width+ "+" + height + ")" + "=" + perimeter);
    }
}