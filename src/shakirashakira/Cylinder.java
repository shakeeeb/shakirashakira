package shakirashakira;
import java.util.Scanner;
import java.text.DecimalFormat;
// Shakeeb Saleh 109239204

public class Cylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		double radius;
		double area;
		double length;
		double volume;
		
		System.out.print("Please enter a value for the radius of the Cylinder: ");
		radius = input.nextDouble();
		
		System.out.print("Please enter a value for the length of the cylinder: ");
		length = input.nextDouble();
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("the area of the cylinder is " + df.format(area) + " sq units");
		System.out.print("The volume of the cylinder is " + df.format(volume) + " units cubed");

	}

}
