
import java.math.*;
import java.util.*;
public class Amstrong {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        int start=br.nextInt();
        int end=br.nextInt(); 
        int digits=(int)Math.log10(start)+1;
        isArmstrong am = new isArmstrong();
        
        for(int n=start; n<=end; n++){
            if(am.isArmstrong(n,digits)){
                System.out.println(n);
            }
        }
    }
}
class isArmstrong{
    public isArmstrong(){
        
    }
    public boolean isArmstrong(int num,int digits){
        int sum=0;
        int temp=num;
        for(int i=num; i>0; i/=10){
            sum+=Math.pow(num%10,digits);
            num/=10;
        } 
        return sum==temp;
    }
    }