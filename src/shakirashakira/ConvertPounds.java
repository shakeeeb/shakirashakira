package shakirashakira;

import java.util.Scanner;
import javax.swing.*;
import java.text.DecimalFormat;

public class ConvertPounds {
	
	public static double kilos(double cPounds){
		double result;
		result = cPounds*2.2;
		return result;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		
		double pounds = 1;
		int count = 0;
		
		while(count < 199){
			System.out.println(df.format(pounds) + " pounds is "+ df.format(kilos(pounds)) + " kilograms");
			pounds++;
			count++;
		}
		

	}

}
