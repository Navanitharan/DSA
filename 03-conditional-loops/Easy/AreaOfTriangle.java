import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        double length = sc.nextDouble();
        System.out.println("Enter the breath");
        double brth = sc.nextDouble();
        sc.close();

        System.out.println("Area of Triangle is " + Area(length, brth));
    }

    public static double Area(double l, double b) {
        final double area = ((1 / 2.0) * (l * b));
        return area;
    }
}
