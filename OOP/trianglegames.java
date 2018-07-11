import java.util.*;
import java.io.*;

public class trianglegames{
  public static void main (String [] args){
    
    //Lets have fun with printing shapes and loops
    
    System.out.println("Lets take a number");
    Scanner scan = new Scanner(System.in);
    int x = Integer.parseInt(scan.nextLine());
    
    for (int i=0; i<=x;i++){
      for(int j=0; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i=x; i>=0;i--){
      for(int j=1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
                   
  }
}