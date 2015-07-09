package shakirashakira;
import javax.swing.JOptionPane;

//Shakeeb Saleh 109239204

public class PositivesNegatives {

	public static void main(String[] args) {
		String num;
		int numbah;
		int total = 0;
		double average;
		int countPos = 0;
		int countNeg = 0;
		
		do {
			num = JOptionPane.showInputDialog(null, "please enter a numbers you wish to average (end with zero): ");
			numbah = Integer.parseInt(num);
			total += numbah;
			if (numbah < 1){
				countNeg++;
			} else if (numbah > 1){
				countPos++;
			}
			
			} while ( numbah != 0);
		average = total/(countNeg + countPos);
		JOptionPane.showMessageDialog(null, "The Average is: " + average + 
				"\n there were " + countNeg + " negative numbers and "
				+ countPos + " positive numbers, \n"
				+ " which totaled" + total);
		}

	}

