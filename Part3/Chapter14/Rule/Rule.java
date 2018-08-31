import java.util.Scanner;
import java.text.*;
public class Rule{
    public static void main(String[]args){
        Scanner intrest = new Scanner( System.in ); 
        System.out.println("Enter intrest Rate:");
        double i = intrest.nextDouble();
        double doub =72.0/i;
        System.out.println(doub);
    }
}