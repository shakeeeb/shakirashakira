package shakirashakira;
import javax.swing.JOptionPane;

// Shakeeb Saleh 109239204

public class ISBN {

	public static void main(String[] args) {
		
		String enterisbn;
		String isbn;
		int[] numericISBN= new int[9];
		
		enterisbn = JOptionPane.showInputDialog(null, " Please enter an ISBN number");
		isbn = ("000000000" + enterisbn).substring(enterisbn.length());
		for (int i =0; i < isbn.length(); i++){
			numericISBN[i] = Character.getNumericValue(isbn.charAt(i));
			
		}
		
		int checksum = ((numericISBN[0]*1) + (numericISBN[1]*2) + (numericISBN[2]*3) + (numericISBN[3]*4) + (numericISBN[4]*5) + (numericISBN[5]*6) + (numericISBN[6]*7) + (numericISBN[7]*8) + (numericISBN[8]*9) ) % 11;
		
		if (checksum == 10){ JOptionPane.showMessageDialog(null," the correct ISBN number is: \n"
				+ numericISBN[0]+ ""
				+ numericISBN[1] + ""
				+ numericISBN[2] + ""
				+ numericISBN[3] + ""
				+ numericISBN[4] + ""
				+ numericISBN[5] + ""
				+ numericISBN[6] + ""
				+ numericISBN[7] + ""
				+ numericISBN[8] + ""
				+ "X");
			
		} else {
		
		JOptionPane.showMessageDialog(null,"the correct ISBN number is: \n"
				+ numericISBN[0]+ ""
				+ numericISBN[1] + ""
				+ numericISBN[2] + ""
				+ numericISBN[3] + ""
				+ numericISBN[4] + ""
				+ numericISBN[5] + ""
				+ numericISBN[6] + ""
				+ numericISBN[7] + ""
				+ numericISBN[8] + ""
				+ checksum);
		}
		
			
		} 
		}
		


