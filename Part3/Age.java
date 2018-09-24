import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Age in Years: ");
        double year = scan.nextDouble();
        System.out.println("Age in Months: ");
        double month = scan.nextDouble();
        System.out.println("Age in Days: ");
        double day = scan.nextDouble();
        double yday = year * 365;
        if(month == 1){
            double mday = 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 2){
            double mday = 31 + 28;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 3){
            double mday = 31 + 28 + 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 4){
            double mday = 31 + 28 + 31 + 30;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 5){
            double mday = 31 + 28 + 31 + 30 + 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 6){
            double mday = 31 + 28 + 31 + 30 + 31 + 30;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 7){
            double mday = 31 + 28 + 31 + 30 + 31 + 30 + 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 8){
            double mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 9){
            double mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 10){
            double mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }if(month == 11){
            double mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            double tday =yday + day + mday;
            double hours = tday * 24;
            double min = hours * 60;
            double sec = min * 60;
            System.out.println(sec);
            double per = 2.5 * Math.pow(10, 9);
            double tper = per / sec;
            System.out.println(tper);
        }
    } 
}