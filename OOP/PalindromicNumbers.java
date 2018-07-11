import java.util.*;

//Just fun with math
public class PalindromicNumbers{

//numbers that remain the same even when digits are reversed.
     public static void main(String []args){

        System.out.println("Please enter a number");
        Scanner myscan = new Scanner (System.in);
        
        String num2 = myscan.nextLine();
        myscan.close();
         
        //conversion by converting string to buffer
        String res1= new StringBuffer(num2).reverse().toString();
        System.out.println(res1.equals(num2)? num2 + " is a Palindrome " : num2+ " is not a palindrome");
         
         
        //Comparison using integer - Should generate error
        /*
        int res2 = (num).reverse();
        
        System.out.println(res2.equals(num)?  num +" is a Palindrome": num+" is not a Palindrome ");
         */
         
     }
}