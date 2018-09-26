import java.util.Scanner;
public class RangeAdder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumin = 0;
        int sum = 0;
        System.out.println("Enter low end of range");
        int min = scan.nextInt();
        System.out.println("Enter high end of range");
        int max = scan.nextInt();
        int data = min+1;
        while(data > min){
            System.out.println("Enter Data:");
            data = scan.nextInt();
            if(data < max && data > min){
            sumin = sumin + data;
            }
            else{
            sum = sum + sumin + data;
            }
        }
        System.out.println("Sum of In range values : " + sumin);
        System.out.println("Sum of all range values: " + sum);
    }
}