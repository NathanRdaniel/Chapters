import java.util.Scanner;
public class gallon{
    public static void main(String[] args) {
        int initial = 1;
        while(initial > 0){
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial miles: ");
         initial = scan.nextInt();
        System.out.println("Final miles: ");
        int finale = scan.nextInt();
        System.out.println("Gallons: ");
        int gallons = scan.nextInt();
      int range =  finale - initial;
      double mpg = range / gallons;
      System.out.println("MPG:" + mpg);
       }
    }
}