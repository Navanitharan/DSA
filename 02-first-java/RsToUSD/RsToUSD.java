import java.util.Scanner;
public class RsToUSD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int INR;

        System.out.println("Enter the Rs to Convert to USD");
        INR=sc.nextInt();

        System.out.println(INR+" Rs is equal to "+(INR*0.012)+" USD");
    }
}
