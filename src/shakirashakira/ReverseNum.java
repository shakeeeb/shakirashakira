package shakirashakira;
import javax.swing.JOptionPane;

//Shakeeb Sale

public class ReverseNum {
	
	public static int reverse(int number){
		{int reverse = 0;
		while (number != 0){
			reverse = reverse*10 + number % 10;
			number = number / 10;
		}
		return reverse;}
	}

	public static void main(String[] args) {
		String input;
		int number;
		input = JOptionPane.showInputDialog(null, "Please enter a number you wish to reverse: ");
		number = Integer.parseInt(input);
		number = reverse(number);
		
		JOptionPane.showMessageDialog(null, "The reversed number is: " + number);
		
		

	}

}
