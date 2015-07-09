package shakirashakira;
import java.text.DecimalFormat;

public class ConvertKilos {
	
	public static double pounds(double cKilo){
		double result;
		result = cKilo/2.2;
		return result;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		double kilos = 1;
		int count = 0;
		double oKilos = 5;
		System.out.println(" kilograms Pounds Pounds Kilograms");
		
		while (count < 199){
			System.out.println( kilos + " " + df.format(pounds(kilos)) + " " + oKilos + " " + df.format(pounds(oKilos)));
			kilos++;
			count++;
			oKilos += 5;
		}

	}

}
