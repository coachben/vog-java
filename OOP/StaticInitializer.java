import java.util.*;

public class StaticInitializer{
 
static Scanner input = new Scanner (System.in);
static int Breadth = input.nextInt();
static int Height = input.nextInt();
static boolean flag = Breadth >0 && Height > 0;
  
static  {
if (!flag){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
  }
}



  public static void main (String [] args){
  //nothing goes here for now
  }

}