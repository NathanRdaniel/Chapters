import java.util.Scanner;
public class chap16e2{
    public static void main(String[] args) {
        double count = 1.0;
        double add = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scan.nextInt();
        while(count<= n){
            add =add  + (1.0 / count);
            count++;
        }    
        System.out.println(add);
    }
}