import java.util.Scanner;
public class Jetlag{
    public static void main(String[] args) {
        double departformula = 0;
        double arivalformula = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of hours of Travel:");
        double hours = scan.nextInt();
        System.out.println("Enter Number of Zones Crossed:");
        double zones = scan.nextInt();
        System.out.println("Enter Depart Time:");
        double depart = scan.nextInt();
        System.out.println("Enter Arival time");
        double arival = scan.nextInt();
        if(depart >= 801 && depart <= 1200){
            departformula = 0;
        }
        if(depart >= 1201 && depart <= 1800){
            departformula = 1;
        }
        if(depart >= 1801 && depart <= 2200){
            departformula = 3;
        }
        if(depart >= 2201 && depart <= 0100){
            departformula = 4;
        }
        if(depart >= 101 && depart <= 800){
            departformula = 5;
        }
        
        //Arival
        
        if(arival >= 801 && arival <= 1200){
            arivalformula = 4;
        }
        if(arival >= 1201 && arival <= 1800){
            arivalformula = 2;
        }
        if(arival >= 1801 && arival <= 2200){
            arivalformula = 0;
        }
        if(arival >= 2201 && arival <= 0100){
            arivalformula = 1;
        }
        if(arival >= 101 && arival <= 800){
            arivalformula = 3;
        }
        
        double recovery = (hours/2 + (zones - 3) + departformula + arivalformula) / 10;
        System.out.println(recovery + " Days");
    }
}