import java.util.Scanner;
public class App
{
  public static void main ( String[] args )
  {
  
   Scanner scan = new Scanner( System.in ); 
    System.out.println("Enter cost per kilowatt-hour in cents: ");
   double num = scan.nextDouble();
   double cost = num / 100;
   System.out.println(cost);
    Scanner syst = new Scanner( System.in ); 
    System.out.println("Enter kilowatt-hours used per year:  ");
   double dum = syst.nextDouble();
   double fum = dum * num;
   double annual = fum / 10000;
   System.out.println(annual);

   }
  }