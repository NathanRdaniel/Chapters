import java.util.Scanner;
public class Exercise3{
    public static void main (String[] args){
        int dot = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Word:");
        String first = scan.next();
        System.out.println("Enter Second Word:");
        String second = scan.next();
        System.out.print(first);
        while(dot <= 30){
            System.out.print(".");
            dot = dot + 1;
        }
        System.out.print(second);
    }
}