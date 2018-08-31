import java.util.Scanner;
public class Log
{
public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Double: ");
    double x = scan.nextFloat();
    double logx = Math.log(x);
    double log2 = Math.log(2);
    double b2 = logx / log2;
    System.out.println("Log bace 2 of: " + x + " = " + b2);

    }
}