import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=1;
        while(num!=0){
            temp*=num;
            num-=1;
        }
        System.out.println("Factorial of "+num+" = "+temp);
    }
}