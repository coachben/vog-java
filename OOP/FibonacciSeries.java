import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String [] args){
    int count =0, num1=1, num2= 1;
    
    System.out.print("Enter Your Fibonnacci Series numbers");

    Scanner myscan = new Scanner(System.in);
    count=myscan.nextInt();
    myscan.close();
    
    
    int i=0;
    
    while(i<=count){
       // System.out.println(num1+ "");
        int sumnums=num1+num2;
        num1=num2;
        num2=sumnums;
        i++;
    }
        System.out.print("The Nth element is "+ num2 );

    }
}