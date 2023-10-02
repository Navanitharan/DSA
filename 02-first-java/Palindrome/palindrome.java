import java.util.Arrays;
import java.util.Scanner;

/////////////////////////////////method 1///////////////////////////////////////

// public class palindrome {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String input;
//         char arr[],arrrvs[];

//         input=sc.next();
//         int n=input.length();

//         arr =new char[n];
//         arrrvs=new char[input.length()];

//         for(int i=0;i<n;i++){
//             arr[i]=input.charAt(i);
//             arrrvs[n-i]=input.charAt(i);
//         }

        
//         if(Arrays.toString(arr).equals(Arrays.toString(arrrvs))){
//             System.out.println(input +" is an palindrome");
//         }
//         else{
//             System.out.println(input+" is not an palindrome");
//         }
//     }
// }


/////////////////////////////////////////optimized version of method one////////////////////////////////

// import java.io.*;

// public class Main {
//     public static void main(String args[]) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String input;
//         System.out.println("Enter the String");
//         input=br.readLine();
       
//        int left=0;
//        int right=input.length()-1;
//        while(left<right){
//            if(input.charAt(left) != input.charAt(right)){
//                System.out.println("its not an palindrome");
//                break;
//            }
//            else{
//                System.out.println("its a palindrome");
//            }
//            left++;
//            right--;
//        }
       
       
//     }
// }

////////////////////////////////////////method 2 static method///////////////////////////////////////////

// import java.io.*;

// public class Main {
//     public static void main(String args[]) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String input;
//         System.out.println("Enter the String");
//         input=br.readLine();
       
//        if(isPalindrome(input)){
//            System.out.println("its a palindrome");
//        }else
//             System.out.println("its not a palindrome");    
       
//     }
//     public static boolean isPalindrome(String str){
//         int left=0;
//         int right=str.length()-1;
//         while(left<right){
//             if(str.charAt(left) != str.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }

//////////////////////////////////////////method 2 non-static method//////////////////////////////////////////



// import java.io.*;

// public class Main {
//     public static void main(String args[]) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String input;
//         System.out.println("Enter the String");
//         input=br.readLine();
       
//         Main m = new Main();
       
//        if(m.isPalindrome(input)){
//            System.out.println("its a palindrome");
//        }else
//             System.out.println("its not a palindrome");    
      
//     }
    
//     public boolean isPalindrome(String str){
//         int left=0;
//         int right=str.length()-1;
//         while(left<right){
//             if(str.charAt(left) != str.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }







/////////////////////////////////////////////method 3 seperate class////////////////////////////////////////////////

import java.io.*;
class isPalindrome{
    public isPalindrome() {
        
    }
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class palindrome {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("Enter the String");
        input=br.readLine();
       
       isPalindrome pldrm = new isPalindrome();
       
       if(pldrm.isPalindrome(input)){
           System.out.println("its a palindrome");
       }else
            System.out.println("its not a palindrome");    
      
    }
    
}