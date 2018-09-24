import java.util.Scanner;
public class intigers{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Start: ");
    int start = scan.nextInt();
    System.out.println("Enter End: ");
    int end = scan.nextInt();
    while(start <= end){
        System.out.println(start);
        start ++;
    }
    }
}