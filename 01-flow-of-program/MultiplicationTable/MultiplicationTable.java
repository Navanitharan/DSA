import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,i;
        System.out.println("Enter the number");
        num=sc.nextInt();
        i=1;
        while(i<=10){
            System.out.println(num+" X "+i+" = "+i*num);
            i++;
        }
    }
}
