import java.util.Scanner;
public class Ohm
{
public static void main(String[] args ){

 Scanner rist = new Scanner( System.in );
 Scanner volt = new Scanner( System.in );
  System.out.println("Risitance:");
   int r = rist.nextInt();
    System.out.println("Voltage:");
   int  v = volt.nextInt();
   double i = (v + 0.0)/r;
   System.out.println("Current: " + i);
}



}