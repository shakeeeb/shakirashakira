package shakirashakira;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class coolio{
			public static int[] merge(int[] foo, int[] bar){
				int[] foobar = new int[foo.length + bar.length];
					for (int i = 0; i <= foo.length - 1; i++){
						foobar[i] = foo[i];
					} 
					for (int i = foo.length; i <= foobar.length - 1; i++){
						foobar[i] = bar[i - foo.length];
					} 
				java.util.Arrays.sort(foobar);
			return foobar;
			}
			
			public static void main(String[] args){
				String fullName = "";
				String firstName = "";
				String lastName = "";
				
				fullName = JOptionPane.showInputDialog(null, " Please type in a name: ");
			
				if(fullName.contains(",")){
					firstName = fullName.substring(fullName.indexOf(",")+2, fullName.length());
					lastName = fullName.substring(0, fullName.indexOf(","));
					} else {
					firstName = fullName.substring(0, fullName.indexOf(" "));
					lastName = fullName.substring(fullName.indexOf(" ")+1, fullName.length());
					}
				JOptionPane.showMessageDialog(null, firstName + " " + lastName);
				
			}
				}
			
			
		
	

