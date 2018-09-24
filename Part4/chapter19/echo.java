import java.util.Scanner;
public class echo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        int ammount = word.length();
        System.out.println(ammount);
        int count = 1;
        while(count <= ammount){
            System.out.println(word);
            count = count + 1;
        }
    }
}
