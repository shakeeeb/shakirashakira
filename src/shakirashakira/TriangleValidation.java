package shakirashakira;
import javax.swing.JOptionPane;
import java.util.Arrays;

// Shakeeb Saleh 109239204



public class TriangleValidation {
	
	public static void main(String[] args) {
		int side1, side2, side3;
		String first, second, last;
		
		first = JOptionPane.showInputDialog(null, "Please enter a value for one side of a triangle.");
		side1 = Integer.parseInt(first);
		
		second = JOptionPane.showInputDialog(null, "Please enter a value for another side of the same triangle");
		side2 = Integer.parseInt(second);
		
		last = JOptionPane.showInputDialog(null, "please enter a value for the last side of the triangle");
		side3 = Integer.parseInt(last);
		
		int[] sorted = new int[3];
		
		sorted[0]= side1;
		sorted[1]= side2;
		sorted[2]= side3;
		
		Arrays.sort(sorted);
		
		if (sorted[0] + sorted[1] > sorted[2]){
			JOptionPane.showMessageDialog(null, "Congratulations, This is a valid triangle!");
		} else {
			JOptionPane.showMessageDialog(null, "Unfortunately, this is not a valid triangle.");
		}

	}

}
