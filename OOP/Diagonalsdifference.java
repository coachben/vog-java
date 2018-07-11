import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Diagonalsdifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr,n) {

      //initialize diagonals sums
      int s1 = 0, s2 = 0;
      
      for (int i=0; i< n;i++){
        
        for(int j=0; j< n;j++){
          
          //finding sum of primary diagonal
          if (i==j)  s1 += arr[i][j];
          
          //finding sum of secondary diagonal
          if (i==n-j-1)  s2 += arr[i][j];
        }
      }
        
    //absolute difference of sums
      return Math.abs(s1 - s2);
      

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];
      //ex
      //
      //
      //

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
