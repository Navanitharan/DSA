import java.util.Scanner;

public class Fabinosis {
    public static void mian(String args[]){
        Scanner sc=new Scanner(System.in);
        int fbn;
        int n=1,fnum=0,snum=1,tnum;

        System.out.println("Enter the number");
        fbn=sc.nextInt();
        
        System.out.println(fnum);
        while(n<=fbn){
            tnum=fnum+snum;
            System.out.println(","+tnum);
            fnum=snum;
            snum=tnum;
            n++;
        }
    }
}
