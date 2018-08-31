import java.util.Scanner;

public class Wind{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Wind Speed:");
        double windSpeed = scan.nextDouble();
        System.out.println("Enter Temp:");
        double temp = scan.nextDouble();
        if(windSpeed > 3 && temp <= 50){
            double Windchill = 35.74 + 0.625 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
            System.out.println(Windchill);
        }else{
            System.out.println(temp);
        }
    }
}