import java.util.Scanner;
public class SumOdd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        double count = 1;
        double sum = 0;
        int n = scan.nextInt();
        for(double i = 1; i <= n; i+=2){
            //System.out.println("Working");
           //System.out.println(i);
           count = count + 1;
           sum = i;
           //System.out.println(count);

        }  
         double odd = sum / count;
         System.out.println(odd);
         System.out.print(odd * odd);
    }
}