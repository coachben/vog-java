import java.util.*;
 public class SecConverter {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
        int sec = seconds % 60;
        int hr = seconds / 60;
        int min = hr % 60;
        hr = hr / 60;
        System.out.print( hr + ":" + min + ":" + sec);
		System.out.print("\n");
    }    
 }