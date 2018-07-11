import java.util.*;
import java.io.*;


public class sortingNumbers{
  
  static int[] SortedArrNums(int[] arr){
    int pos=0, neg=0,zeros=0;
    //lets collect the positives first
    for (int i : arr){
          if (arr[i]>0) pos++;
          if (arr[i]<0) neg++;
          if (arr[i]==0) zeros++;      
    }
     int result[]={pos,neg,zeros};

    return result;

  }
  
  public static void main(String []args){
    
    Scanner myscan = new Scanner(System.in);
    System.out.print("Enter value of N counts");
    int n = Integer.parseInt(myscan.next());
    
    //declare a new array
    int[] arr = new int[n];
    //loop through the console entries  
    String[] arritems = myscan.nextLine().split(" ");
    
    for (int i=0; i<n; i++){
      //Fill up your array's stomach
      int arritem = Integer.parseInt(arritems[i]);
      arr[i] = arritem;
      
    }
  
    //finally proceed and pass it on 
    int[] res = SortedArrNums(arr);
    
    System.out.println("Positives" + res[0]);
    System.out.println("Negatives" + res[1]);
    System.out.println("Zeros" + res[2]);
    myscan.close();
  }
}




/** Works Good on Java 8***
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr,int n) {
    int pos=0, neg=0,zeros=0;
    //lets collect the positives first
    for (int i=0;i<arr.length;i++){
          if (arr[i]>0) pos++;
          if (arr[i]<0) neg++;
          if (arr[i]==0) zeros++;      
    }
     int result[]={pos,neg,zeros};

        
    System.out.println((double)result[0]/n);
    System.out.println((double)result[1]/n);
    System.out.println((double)result[2]/n);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr,n);

        scanner.close();
    }
}

**/