import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Start:");
        int start = scan.nextInt();
        System.out.println("Enter End:");
        int End = scan.nextInt();
        System.out.println("    ");
        while( start <= End)
        {
            System.out.println(start);
            start = start + 1;
        }
    }
    
}