import java.util.*;
public class Leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        int inpt=sc.nextInt();
        if(inpt % 4 == 0 && inpt % 100 != 0 || inpt % 400 == 0){
            System.out.println(inpt+" is an leap Year");
        }
        else{
            System.out.println("It's not an leap Year");
        }
    }
}