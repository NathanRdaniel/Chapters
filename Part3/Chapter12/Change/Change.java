import java.util.Scanner;
public class Change
{
  public static void main ( String[] args )
  {
  
   Scanner scan = new Scanner( System.in ); 
    System.out.println("Change:");
   int num = scan.nextInt();
   int change = num % 100;
   int doll = num / 100;
  int qt = change / 25;
  int remanderQ = change % 25;
  int dm = remanderQ / 10;
  int remanderR = remanderQ % 10;
  int nk = remanderR / 5;
  int remanderN = remanderR % 5;
  int pn = remanderN;
    System.out.println("Dollers: " + doll + " Quorters :" + qt + " Dime: " + dm + " Nickel: " + nk + " Penny: " + pn );
  }
  }