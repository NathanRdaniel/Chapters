import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Pie{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight: ");
        int weight = scan.nextInt();
        if(weight >= 220 && weight <= 280){
            System.out.println("Ok to Enter");
        }else if(weight > 280){
            System.out.println("loose weight");
        }else{
            System.out.println("Gain Weight");
        }
    }
}