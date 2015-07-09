package shakirashakira;
import java.util.Scanner;

public class arrayChecker {
	
	public static void main (String[] args){
		//diamond
		for (int row=1; row <= 8; row++){
			for(int column = 9; column > row; column--){
				System.out.print(" ");
			}
			for(int column = 1; column <= row; column++){
				System.out.print("*");
			}
			for(int column = 2; column <= row; column++){
				System.out.print("*");
			}
			System.out.println();
		}
	
		for (int row = 1; row <= 9; row++){
			// spaces
			for(int column = 1; column < row; column++){
				System.out.print(" ");
			}
			// print first half of pyramid, left side
			for(int column = row; column < 10; column++){
				System.out.print("*");
			}
			// print second half of pyramid, right side
			for(int column = 8; column >= row; column--)
				System.out.print("*");
			System.out.println();
		}
	
	}
	
}

