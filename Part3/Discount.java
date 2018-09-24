import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in ); 
        System.out.println("Purchase Ammount: ");
        double purchase = scan.nextDouble();
        if(purchase > 10.00){
            double discount = purchase * 0.90;
            System.out.println("Discount price: " + discount);
        }else{
            System.out.println("Price: " + purchase);
        }
    
    }
}