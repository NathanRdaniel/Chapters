import java.util.Scanner;
public class Tire{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input front right tire: ");
        int fr = scan.nextInt();
        System.out.println("Input front left tire: ");
        int fl = scan.nextInt();
        System.out.println("Input back right tire: ");
        int br = scan.nextInt();
        System.out.println("Input back left tire: ");
        int bl = scan.nextInt();
        if(bl == br && fl == fr){
            System.out.println("Inflation is OK ");
        }else{
            System.out.println("Inflation is NOT ok ");
        }
    }
}