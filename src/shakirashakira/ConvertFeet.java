package shakirashakira;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Shakeeb Saleh 109239204


public class ConvertFeet {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	double feet, meters;
	String inFeet;
	
	inFeet = JOptionPane.showInputDialog(null, "Please input the number of\n feet you wish to convert: ");
	feet = Double.parseDouble(inFeet);
	
	meters = feet * 0.305;
	
	JOptionPane.showMessageDialog(null, feet + " feet is " + df.format(meters) + " meters.");
	
	}
}
