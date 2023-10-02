import java.util.Scanner;

public class SimpleInterst {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p,r,t,SI;
        System.out.println("Eneter the Amount");
        p=sc.nextInt();
        System.out.println("Enter the Rate of intrest");
        r=sc.nextInt();
 
        System.out.println("Enter the Time");
        t=sc.nextInt();
        SI=(p*r*t)/100;
        System.out.println("The Simple intrest will be "+SI+" + "+p+" the Amount borrowed" );
    }
}
