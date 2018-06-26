//Helping Mr K with distance difference on co-ordinates

import java.util.*;


public class Distancediff{

public static double getDistance(int x1, int x2,int y1, int y2){
 //doing the math
 return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
 
}
     public static void main(String []args){
        System.out.println("Enter your co-ordinates");
        Scanner myscan = new Scanner(System.in);
        
        int x1,x2,y1,y2;
        double distance;
        
        x1 = myscan.nextInt();
        x2 = myscan.nextInt();
        y1 = myscan.nextInt();
        y2 = myscan.nextInt();
        
        distance= getDistance(x1,x2,y1,y2);
        
        System.out.println("Distance between Point A ("+ x1 +","+ y1+") and B ("+x2 +","+ y2 +") is " +distance +" units");
        
     }
}