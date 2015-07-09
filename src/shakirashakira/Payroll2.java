package shakirashakira;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Shakeeb Saleh 109239204


public class Payroll2 {
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("#.##");
		
		// intial string values to be input
		String name;
		String hours;
		String rate;
		String federal;
		String state;
		
		// information derived from input information

		
		double hoursWorked;
		double payRate;
		double federalTaxPercent;
		double stateTaxPercent;
		
		// information that needs to be calculated

		double grossPay;
		double netPay;
		double federalTaxDollars;
		double stateTaxDollars;
		double totalDeduction;

		double sPercent;
		double fPercent;
		
		// prompts for information and conversion from string to double values

		name = JOptionPane.showInputDialog(null,"Enter employee's name:");
		
		hours = JOptionPane.showInputDialog(null," Enter number of hours worked in a week:");
		hoursWorked = Double.parseDouble(hours);

		rate = JOptionPane.showInputDialog(null, " Enter hourly pay rate:");
		payRate = Double.parseDouble(rate);

		federal = JOptionPane.showInputDialog(null," Enter federal tax withholding rate (as a decimal):");
		federalTaxPercent = Double.parseDouble(federal);

		state = JOptionPane.showInputDialog(null, " Enter state tax withholding rate(as a decimal): ");
		stateTaxPercent = Double.parseDouble(state);
		
		//calculating nessc variables from input data

		grossPay = hoursWorked*payRate;

		federalTaxDollars = grossPay*federalTaxPercent;

		stateTaxDollars = grossPay*stateTaxPercent;

		totalDeduction = stateTaxDollars + federalTaxDollars;

		netPay = grossPay - totalDeduction;
		
		sPercent = stateTaxPercent*100;
		fPercent = federalTaxPercent*100; 
		
		//final output
		
		JOptionPane.showMessageDialog(null,"Employee Name: " + name + "\n"
		 + "Hours Worked:  " + hoursWorked + "\n"
		 + "Pay Rate:  $" + df.format(payRate) + "\n"
		 + "Gross Pay:  $" + df.format(grossPay) + "\n"
		 + "Deductions: \n" 
		 + "  Federal Withholding (" + df.format(fPercent) + "%):  $" + df.format(federalTaxDollars) + "\n"
		 + "  State Withholding (" + df.format(sPercent) + "%):  $" + df.format(stateTaxDollars) + " \n"
		 + "  Total Deduction: $" + df.format(totalDeduction) + "\n"
		 + "Net Pay: $" + df.format(netPay));
		}
}
