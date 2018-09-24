import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("User Name: ");
        String username = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        if(username == "gates"){
            if(password == "monopoly"){
                System.out.println("You have logged in with a priority 1");

            }
            else{
                System.out.println("Login failed1");
            }
        }
        if(username == "Jobs"){
            if(password == "Apple"){
                System.out.println("You have logged in with a priority 3");

            }
            else{
                System.out.println("Login failed2");
            }
        }
        if(username == "quit"){
            if(password == "exit"){
                System.out.println("System shutting down.");
                System.out.println("Bye.");
            }
            else{
                System.out.println("Login failed3");
            }
        }
        else{
            System.out.println("Login failed4");
        }
    }
}