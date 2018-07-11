import java.util.*;


public class StringManipulation{
  
      static int funcBiggest(int[] vals){
      int maxIndex=0; //start with 0th element as max
      for(int i=1; i<vals.length;i++){  //loop from 1st element comparing to the 0th
        if (vals[i] > vals[maxIndex]) {
          maxIndex=i;
        }
      }
      return maxIndex;
    }
  
     static int funcSmallest(int[] vals){
     int minIndex=0; //start with 0th element as min
      for(int i=1; i<vals.length;i++){
        if (vals[i] < vals[minIndex]){
          minIndex=i;
        }
      }
      return minIndex;
    }
  
  public static void main(String [] args){
  String strVowels = "AEIOU";
    String reverse="";
    
    //sample to reverse a string
    for (int i=strVowels.length()-1; i>=0;i--){      
      //Finally store them in a reversed order
      reverse = reverse + strVowels.charAt(i);

    } 
        System.out.println(reverse);
    // There are alternatives like using stringbuilder class with sb.append(str.charAt(i));
    //alternatively use the strinbuilders reverse method like this. sb.reverse().toString());

    
    int[] a = { 2, 4, 5, 6, 9, 3, 7 };
    int[] b = { 2, 4, 5, 6, 9, 13, 7 };

    //Find the smallest element in an array.
    
    int smallest = funcSmallest(a);
    int biggest = funcBiggest(b);
    System.out.println("Minimum in array a is " + a[smallest]);
    System.out.println("Maximum number in array b is " + b[biggest]);
    
  }
  
  
}
