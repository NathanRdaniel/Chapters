import java.util.Scanner;
public class Dist
{
  public static void main ( String[] args )
  {
  
   Scanner scan = new Scanner( System.in ); 
    System.out.println("Enter number of secconds: ");
double s= scan.nextDouble();
double t = Math.pow(s , 2);
double g = 32.174;
double f = g * t;
double d = (0.5) * f;
System.out.println("Distance: " + d);

}
}