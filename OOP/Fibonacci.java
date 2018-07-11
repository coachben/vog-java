import java.util.Scanner;
import java.io.*;

public class Fibonacci {
    
    public static void main(String [] args){
    int count =0, num1=1, num2=1, Nth=0;
    
    System.out.print("How many numbers you want in the series  Enter a num 0-10 : ");


    Scanner myscan = new Scanner(System.in);
    count=myscan.nextInt();
    
    
    int i=0;
    
    while(i<=count){
        System.out.println(num2+ "" );
        int sumnums=num1+num2;
        num1=num2;
        num2=sumnums;
        i++;
    }
        System.out.println("Nth element is the last element");

    }
}