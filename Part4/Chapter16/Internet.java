import java.util.Scanner;
public class Internet{
    public static void main(String[] args) {
        double nightprice = 3.00;
        double delivery = 2.00;
        double nightdp = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The item");
        String item = scan.next();
        System.out.println("Enter The price");
        double price = scan.nextDouble();
        System.out.println("Overnight delivery(0 == no, 1 == yes)");
        int overnight = scan.nextInt();
        if(price >= 10 && overnight == 1){
            System.out.println("Invoice: ");
            System.out.println(item +": " + price);
            System.out.println("delivery: " + nightprice);
            double total = price + nightprice;
            System.out.println("Total: " + total);
        }if(price > 10 && overnight == 0){
            System.out.println("Invoice: ");
            System.out.println(item +": " + price);
            System.out.println("delivery: " + 0);
            double total = price;
            System.out.println("Total: " + total);
        }else if(price < 10 && overnight == 1){
            System.out.println("Invoice: ");
            System.out.println(item +": " + price);
            System.out.println("delivery: " + nightdp );
            double total = price + delivery + nightprice;
            System.out.println("Total: " + total);
        }else if( price < 10 && overnight == 0){
            System.out.println("Invoice: ");
            System.out.println(item +": " + price);
            System.out.println("delivery: " + delivery);
            double total = price + delivery;
            System.out.println("Total: " + total);
        }
    }
}