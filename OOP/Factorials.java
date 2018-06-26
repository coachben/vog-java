import java.util.*;

public class Factorials{

     public static void main(String []args){
        System.out.println("Enter num to compute factorial");
        
        Scanner myscan = new Scanner(System.in);
        
        int num= myscan.nextInt();
        myscan.close();

        //compute factorial
        /* and
        *publish
        */
        int i=1;
        long fact =1;

        while (i <= num){
        fact= fact * i;
            i++;
            
        }
        System.out.println("Factorial of " + num + " is "+ fact);
        
     }
}