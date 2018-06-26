import java.util.*;
public class PrimeNumTest{

     public static void main(String []args){
         
        System.out.println("Enter a number to test: ans is true or false");
        
        Scanner myscan = new Scanner(System.in);
        
        int num = myscan.nextInt();
        myscan.close();
        
        //Now lets test
        Boolean isPrime=true;
        for(int i=2; i<=num/2;i++){

            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        
    if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
     }
}