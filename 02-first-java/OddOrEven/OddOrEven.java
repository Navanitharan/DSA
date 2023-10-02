import java.util.Scanner;

public class OddOrEven {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number");
        } else {
            System.out.println(num + " is an Odd Number");
        }
    }
}
