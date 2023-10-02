import java.util.Scanner;

public class Greeting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Name;

        System.out.println("Enter your name");
        Name=sc.nextLine();
        System.out.println("Hello "+Name+" Welcome to the java course");
    }
}
