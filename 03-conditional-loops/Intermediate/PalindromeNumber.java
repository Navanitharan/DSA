import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        String num=sc.next();
        if(isPalindrome(num)){
            System.out.println("It's an Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    
        public static boolean isPalindrome(String num){
            int left=num.length()-1;
            int right=0;
            while(left>right){
                if(num.charAt(right)!=num.charAt(left)){
                    return false;
                }
                right++;
                left--;
            }
            return true;
        }
}

