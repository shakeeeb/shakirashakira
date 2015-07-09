package shakirashakira;

import java.util.Scanner;
import java.text.DecimalFormat;

// Shakeeb Saleh 109239204


public class Payroll{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	
	// information that needs to be input

	String name;
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
	
	// prompts for information

	System.out.print("Enter employee's name:");
	name = input.next();

	System.out.print(" Enter number of hours worked in a week:");
	hoursWorked = input.nextDouble();

	System.out.print(" Enter hourly pay rate:");
	payRate = input.nextDouble();

	System.out.print(" Enter federal tax withholding rate:");
	federalTaxPercent = input.nextDouble();

	System.out.print(" Enter state tax withholding rate: ");
	stateTaxPercent = input.nextDouble();
	
	//calculating nessc variables from input data

	grossPay = hoursWorked*payRate;

	federalTaxDollars = grossPay*federalTaxPercent;

	stateTaxDollars = grossPay*stateTaxPercent;

	totalDeduction = stateTaxDollars + federalTaxDollars;

	netPay = grossPay - totalDeduction;
	
	// conversion into dollar/cents values
	
	sPercent = stateTaxPercent*100;
	fPercent = federalTaxPercent*100; 
	
	//final output
	
	System.out.println("Employee Name: " + name);
	System.out.println("Hours Worked:  " + hoursWorked);
	System.out.println("Pay Rate:  $" + df.format(payRate));
	System.out.println("Gross Pay:  $" + df.format(grossPay));
	System.out.println("Deductions:");
	System.out.println("  Federal Withholding (" + df.format(fPercent) + "%):  $" + df.format(federalTaxDollars));
	System.out.println("  State Withholding (" + df.format(sPercent) + "%):  $" + df.format(stateTaxDollars));
	System.out.println("  Total Deduction: $" + df.format(totalDeduction));
	System.out.println("Net Pay: $" + df.format(netPay));
	}
}