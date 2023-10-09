import java.util.*;

public class AreaOfIsoscelesTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int h,b;double Area;
        System.out.println("Enter the Height");
        h=sc.nextInt();
        System.out.println("Enter the Breath");
        b=sc.nextInt();
        Area=(0.5*(b*h));
        System.out.println("The Area of the Isosceles Triangle is"+Area);;
    }
}
