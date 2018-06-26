import java.util.Scanner;
 
public class MultiplicationTable {
 
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
   
  System.out.println("Input a seed number: ");
  int num1 =in.nextInt();
   
  for (int i=1; i<=num1; i++){
   System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
  }
 }
}