import java.text.*;
import java.util.Scanner;
public class Trig{

    public static void main( String[] args){

		double sinx; 

		double sinb;
		 Scanner scan = new Scanner( System.in ); 

		DecimalFormat numform = new DecimalFormat(" 0.000000;-0.000000");

		System.out.println("Enter Initial Angle: ");
		double ia= scan.nextDouble();
		System.out.println("Enter Final Angle: ");
		double fa= scan.nextDouble();
		System.out.println("Enter Innerval: ");
		double iv= scan.nextDouble();
		
		System.out.println(" ANGLE   " + "   SINE   " );
		System.out.println("-------  " + " -------   " );
	  
			for (double iAngle = ia; iAngle <= fa; iAngle=iAngle+iv){

	   	  sinx = iAngle * Math.PI/180;

		  sinb = Math.sin(sinx);

			if(iAngle == 0){

				System.out.println(" " + numform.format(iAngle) + "       " +numform.format(sinb)  );
			}
			else {

				System.out.println(numform.format(iAngle) + "       " +numform.format(sinb)  );
			}
		

		}
	}
}