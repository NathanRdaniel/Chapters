import java.util.Scanner;
public class Harmonic
{
    public static void main(String[] args) 
    {
        Scanner scanx = new Scanner(System.in);
        Scanner scany= new Scanner(System.in);
        System.out.println("Enter X: ");
        Double x = scanx.nextDouble();
        System.out.println("Enter Y: ");
        double y = scany.nextDouble();
        double h = 2/(1/x + 1/y);
        System.out.println("Harmonic mean: " + h);
    }
}