import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nuts");
        int n = scan.nextInt();
        System.out.println("Enter number of bolts");
        int b = scan.nextInt();
        System.out.println("Enter number of washers");
        int w = scan.nextInt();
        int bb = b * 2;
        if(n == b && bb <= w){
            double nm = n * 0.03;
            double bm = b * 0.05;
            double wm = w * 0.01;
            double price = nm + bm + wm;
            System.out.println("Price: " + price);
        }else{
            System.out.println("Error");
            
        }
        
    }
    
}