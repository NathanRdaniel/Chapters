import java.util.Scanner;

public class Circle
{
  public static void main (String[] args) 
  {
Scanner scan = new Scanner(System.in);
int num;
System.out.println("Radius: ");
num = scan.nextInt();
double area = num *num * Math.PI ;
System.out.println("area: " + area);

    
  }
}