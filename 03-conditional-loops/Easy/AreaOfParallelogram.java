import java.util.Scanner;

public class AreaOfParallelogram {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h, b, Area;
        System.out.println("Enter the Height of the Parallelogram");
        h = sc.nextInt();
        System.out.println("Enter the breath of the Parallelogram");
        b = sc.nextInt();
        Area = h * b;
        System.out.println("The Area of Parallelogram is " + Area);

     }    
}
