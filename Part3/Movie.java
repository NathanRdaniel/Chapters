import java.util.Scanner; 
public class Movie {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scan.nextInt();
        System.out.println("Enter Time");
        int time = scan.nextInt();
   if (age>13 && time < 1700){
       System.out.println("$5");
       
   }
   if(age<13 && time < 1700){
       System.out.println("$2");
       
   }
   else if(age<13 && time > 1700)
   {
       System.out.println("$4");
       
   }
   else if(age > 13 && time > 1700){
       System.out.println("$8");
       
   }
    }
}


