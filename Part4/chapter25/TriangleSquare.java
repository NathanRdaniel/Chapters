import java.util.Scanner;
public class TriangleSquare{
    public static void main(String[] args) {
        int square = 1;
        int count = 1;
        int triangle = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        System.out.println("------------");
        System.out.println("Square");
        System.out.println("------------");
        for(int i = 1; i * i <= n; i++) {
            square = i * i; 
            System.out.println(square);
            if(i * i >= n){
                i = n;
            }

        }
        if(square == n){
            System.out.println("Perfect Square");
        }else{
            int remander = n - square;
            System.out.println("Remander of " +  remander);
        }
        System.out.println("----------------");
        System.out.println("Triangle");
        System.out.println("----------------");
        for(int i = 1; i <= n;i += count){
            System.out.println(i);
            count = count + 1;
            triangle = i;
        }
        if(square == n){
            System.out.println("Perfect Triangle");
        }else{
            int remander = n - triangle;
            System.out.println("Remander of " +  remander);
        }
    }
}

