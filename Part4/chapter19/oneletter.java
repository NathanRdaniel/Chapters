import java.util.Scanner;
public class oneletter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        int ammount = word.length();
        String index;
        String letter = word.charAt(ammount);
        System.out.println(letter);
        System.out.println(ammount);
    }
}