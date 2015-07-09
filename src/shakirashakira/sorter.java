package shakirashakira;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class sorter {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2, num3;
	String first, second, third; 
	
	
	first = JOptionPane.showInputDialog(null, "Please enter the first number you wish to sort: ");
	second = JOptionPane.showInputDialog(null, "Enter the second numebr you wish to sort: ");
	third = JOptionPane.showInputDialog(null, "Please enter the last number you wish to sort: ");
	
	num1 = Integer.parseInt(first);
	num2 = Integer.parseInt(second);
	num3 = Integer.parseInt(third);
	
	if (num1 > num2 && num1 > num3 && num2 > num3){JOptionPane.showMessageDialog(null, num1 +" , " + num2 + " , " + num3); //123
	}
	else if (num1 > num2 && num1 > num3 && num3 > num2){JOptionPane.showMessageDialog(null, num1 + " , " + num3 + " , " + num2); // 132
	}
	else if (num2 > num1 && num2 > num3 && num1 > num3){JOptionPane.showMessageDialog(null, num2 + " , " + num1 + " , " + num3); // 213
	}
	else if (num2 > num1 && num2 > num3 && num3 > num1){JOptionPane.showMessageDialog(null, num2 + " , " + num3 + " , " + num1); // 231
	}
	else if (num3 > num1 && num3 > num2 && num1 > num2){JOptionPane.showMessageDialog(null, num3 + " , " + num1 + " , " + num2); // 312
	}
	else if (num3 > num1 && num3 > num2 && num2 > num1){JOptionPane.showMessageDialog(null, num3 + " , " + num2 + " , " + num1); // 321
	}
		
	}
}
	
