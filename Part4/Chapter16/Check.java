import java.util.Scanner;
public class Check{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter Checkings Balance");
     int checkings = scan.nextInt(); 
     System.out.println("Enter Savings Balance");   
     int savings = scan.nextInt();
     if(checkings >= 1000 ^ savings >= 1500){
         System.out.println("service charge: $0.00");
     }if(checkings < 1000 && savings < 1500){
        System.out.println("Service charge: $0.15");
     }
    }
}