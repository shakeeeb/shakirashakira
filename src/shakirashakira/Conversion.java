package shakirashakira;
import java.util.Scanner;

//Shakeeb Saleh 109239204


public class Conversion {
	public static void main(String[] args){ 
		double fDegrees;
		
		System.out.println("Input the temperature in degrees celsius");
		Scanner input = new Scanner(System.in);
		
		double cDegrees = input.nextDouble();
		
			fDegrees = (9.0/5)*cDegrees + 32;
			
			System.out.println("the temperature is " + fDegrees + " Degrees fahrenheit");
	


	}

}
