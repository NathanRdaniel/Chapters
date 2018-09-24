import java.util.Scanner;
public class AddInt{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many Intigers Will Be Added:");
        Int add = scan.nextInt();
        while(count <= add){
            System.out.println("Enter an integer");
            Int variable = scan.nextInt();
            count = count + 1;
        } 
    }
}