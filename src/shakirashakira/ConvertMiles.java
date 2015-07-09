package shakirashakira;

import java.text.DecimalFormat;

public class ConvertMiles {
	
	public static double kilos(double cMiles){
		double result;
		result = cMiles*1.608;
		return result;
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		
		double miles = 1;
		int count = 0;
		
		while (count < 10){
			System.out.println(df.format(miles) + " miles is "+ df.format(kilos(miles)) + " kilometers");
			miles++;
			count++;
		}

	}

}
