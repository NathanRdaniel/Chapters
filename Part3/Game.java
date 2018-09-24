import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Yertke's Quest");
        System.out.println("Enter your characters name:");
        String name = scan.next();
        System.out.println("Enter strength (1 - 10)");
        int strength = scan.nextInt();
        System.out.println("Enter Health (1 - 10)");
        int health = scan.nextInt();
        System.out.println("Enter Luck (1 - 10)");
        int luck = scan.nextInt();
        int points = luck + health + strength;
        if(points == 15){
            System.out.println("Name: " + name);
            System.out.println("strength: " + strength);
            System.out.println("Health: " + health);
            System.out.println("Luck: " + luck);
            System.out.println("Start game?");
        }if(points > 15){
            System.out.println("Too many points!");
            System.out.println("Resetting to defaults");
            System.out.println("strength: 5");
            System.out.println("Health: 5");
            System.out.println("Luck: 5");
        }if(points < 15){
            System.out.println("Too little points!");
            System.out.println("Resetting to defaults");
            System.out.println("strength: 5");
            System.out.println("Health: 5");
            System.out.println("Luck: 5");
        }
    }
}