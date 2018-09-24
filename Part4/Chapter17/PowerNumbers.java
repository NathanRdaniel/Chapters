import java.util.Scanner;
public class PowerNumbers{
    public static void main(String[] args) {
        int count = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X");
        double x = scan.nextDouble();
        System.out.println("Enter N");
        double n = scan.nextDouble();
        double xhold = x;
        if(n >= 0){
        while(count <= n){
            count = count + 1;
            xhold = xhold * x;
        }
        System.out.println(xhold); 
    }

    }
}