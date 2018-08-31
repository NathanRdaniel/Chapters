import java.util.Scanner;
import java.text.*;
public class Intrest{
    public static void main(String[] args){
        Scanner id = new Scanner( System.in ); 
        Scanner rate = new Scanner( System.in ); 
        Scanner ammount = new Scanner( System.in ); 
        Scanner time = new Scanner( System.in ); 
        DecimalFormat numform = new DecimalFormat("0.00;-0.00");
        System.out.println("Enter Initial Deposit");
        double p = id.nextDouble();
        System.out.println("Enter Intrest rate as a fraction");
        double r = rate.nextDouble();
        System.out.println("Enter Number of times intrest is calculated");
        double n = ammount.nextDouble();
        System.out.println("Enter Time in years");
        double t = time.nextDouble();

        double a = 1 + r/n;
        double b = n * t;
        double c = Math.pow(a, b);
        double v = p * c;
        System.out.println( "Value: " + "$" +  numform.format(v));
    }
}