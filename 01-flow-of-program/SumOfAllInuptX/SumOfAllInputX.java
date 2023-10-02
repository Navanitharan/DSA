import java.util.*;

public class SumOfAllInputX {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int in,sum=0;
        System.out.println("Enter the number,enter 'x' to exite");
        while(sc.hasNext()){
            if(sc.hasNext("x")){
                break;
            }else{
                try{
                    in=sc.nextInt();
                    sum+=in;
                }catch (Exception e){
                    System.out.println("Invalid input enter integer, or 'x' to exit" );

                }
                sc.next();
                continue;
            }
        }
        System.out.println(sum);
        
        }
}
