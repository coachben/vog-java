// My hackerrank challenge https://www.hackerrank.com/challenges/java-datatypes
//Java 8
//mindset - We are comparing the Sizes of the primitive datatypes using == after type casting
import java.util.*;
import java.io.*;


class Java_datatypes{
    public static void main(String []args)
    {
      System.out.print("Enter number of runs you wanna go");
      Scanner myscan = new Scanner(System.in);
      int t = myscan.nextInt();
      
      for (int i =0; i<t; i++ ){
        
        try {
          long longy = myscan.nextLong();
          System.out.println(longy + " Can be fitten in");
           
          byte y = (byte) longy;
            if (y == longy){
              System.out.println("a byte :-) ");
            }
          
          int z = (int)longy;
            if (z==longy){
              System.out.println("an Integer :-)");
            }
           
           System.out.println("A long :-)");
           
         }catch(Exception e){
                System.out.println(myscan.next()+" can't be fitted in my world. Dude!!");
         }

        
        }
        
      }
      
}