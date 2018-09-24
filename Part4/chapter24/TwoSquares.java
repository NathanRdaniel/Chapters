import java.util.Scanner;
public class TwoSquares{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scan.nextInt();
        for(int a = 0; a*a <= n; a++  ){
            for(int b = 0; (a * a)+(b * b) <= n; b++ ){
                if ((a * a)+(b * b) == n ){
                    System.out.println("The two squares that equal " + n + " are " + a + "2, "+ b);
                }
            }
        }
    }
}