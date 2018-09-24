import java.util.Scanner;
public class checkcharge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ammount in checkings: ");
        int checkings = scan.nextInt();
        System.out.println("Enter ammount in savings: ");
        int savings = scan.nextInt();
        if(checkings > 1000 || savings > 1500){
            System.out.println("No fee");
        }
        else{
            System.out.println("Not Working");
        }
    }
}