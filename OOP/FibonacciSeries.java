import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String [] args){
    int count =0, num1=0, num2= 1;
    
    System.out.print("How many numbers you want in the series");

    Scanner myscan = new Scanner(System.in);
    count=myscan.nextInt();
    myscan.close();
    
    System.out.print("Fibbonnaci Series of "+ count + "numbers");
    
    int i=0;
    
    while(i<=count){
        System.out.println(num1+ "");
        int sumnums=num1+num2;
        num1=num2;
        num2=sumnums;
        i++;
    }
    
    }
}