import java.util.Scanner;
import java.text.*;
public class party{
    public static void main(String[] args) {
        double probibility = 1.0;
        int count = 1;
        double dates = 1.0;
        double year = 365;
        DecimalFormat numform = new DecimalFormat("0.000");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Ammount of people:");
        double n = scan.nextDouble();
        System.out.println("---------------------");
        for(int i = 1; i <= n; i++ ){
            dates = dates * (year - i ) / year;
            System.out.println(numform.format(dates));
            if(dates >= 0.49 && dates <= 0.50){
                System.out.println(i + 1 + " people");
            }
        }
        
    }
}