import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        char optr;

        System.out.println("Enter the Numbers to calculate");
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("Enter the Operator('+', '-', '*', '/',) ");
        optr=sc.next().charAt(0);

        if(optr=='+'){
            System.out.println("Addition of "+num1+" + "+num2+" = "+(num1+num2));
        }
        else if(optr=='-'){
            System.out.println("Subtraction of "+num1+" - "+num2+" = "+(num1-num2));
        }else if(optr=='*'){
            System.out.println("Multiplication of "+num1+" * "+num2+" = "+(num1*num2));
        }
        else if(optr=='/'){
            System.out.println("Division of "+num1+" / "+num2+" = "+(num1/num2));
        }
        sc.close();
    }
}
