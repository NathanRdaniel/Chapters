import java.util.Scanner;
public class Permutaions{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        long n = scan.nextLong();
        System.out.println("Enter R:");
        long r = scan.nextLong();
        long result = 1;
        long test = 1;
        if(n >= 0 && r >= 1){
            if(n >= r){
                
                while(n >= r){
                    result = n;
                    System.out.print(n + "   ");
                    n = n-r;
            
                    test = test * n;
        
                    System.out.print(test + "   ");
                }
                //System.out.print(test + "     ");
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }

    }
}