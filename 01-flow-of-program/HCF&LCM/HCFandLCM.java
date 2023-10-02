import java.util.ArrayList;
import java.util.Scanner;
public class HCFandLCM {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num1, num2;
        num1=sc.nextInt();
        num2=sc.nextInt();

        int n1=num1;
        int n2=num2;

        while(num1%num2 != 0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }

        int gcd=num2;
        int LCM= (n1 * n2)/gcd;

        sc.close();

        System.out.println("HCF is "+gcd+" and LCM is "+LCM);
        
    }
}
