import java.util.*;


public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        AreaOfCircle m = new AreaOfCircle();
        
        System.out.println("Enter the radius of the circle");
        int rds=sc.nextInt();
        
        System.out.printf("Area of circle is %.2f",m.Area(rds));
    }
    public double Area(double r){
        double Area=Math.PI*(r*r);
        return Area;
    }
}