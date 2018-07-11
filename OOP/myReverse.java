/* package whatever; // don't place package name! */
import org.apache.commons.lang.StringUtils;

import java.io.*;

class myReverse
{
    public static void main (String[] args) throws java.lang.Exception
    {
      
        Scanner myscan = new Scanner (System.in);
        System.out.println("enter N umber of lines N: 0 to 100 ");
        int count = myscan.nextString();

      /*lets now reverse the strin
for (String word : str.split(" ")) {
    System.out.print(new StringBuilder(str).reverse().toString());
    System.out.print(" ");
}*/

if ( count=>1 && count<=100)
        String input = br.nextString();
      
        System.out.println(input);
        String str = input;
  System.out.println(reverseWords(input));

       //method to meet charArray conditions

      
  else{
    System.out.println("Enter a number between 0 and 100");
  }
      
  String reverseWords(String str) {
    return StringUtils.reverseDelimited(StringUtils.reverse(str), ' ');
}
      
    }

}

