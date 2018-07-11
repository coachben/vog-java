import java.util.*;
import java.text.*;
import java.time.*;
import java.math.*;

// Ensure you are running on java 8
public class IntelliCalendar{

  public static void main (String []args){
  
  Scanner scan = new Scanner (System.in);
  int month = scan.nextInt();
  int day = scan.nextInt();
  int year = scan.nextInt();
  
    //The new java time package is pretty useful. Here are some test arounds.
  LocalDate scanDate = LocalDate.of(year, month, day);
  System.out.print(scanDate.getDayofWeek());
  System.out.print(scanDate.getDayOfWeek());
  System.out.println(scanDate.isLeapYear(1994));
  System.out.println(scanDate.now);
  System.out.println(scanDate.isBefore(1994));
  
  String date = "04/04/2004";
  System.out.println(scanDate.parse(date));

        System.out.println();
    }
}
