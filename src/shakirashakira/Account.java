package shakirashakira;
import java.util.Scanner;
// Shakeeb Saleh 109239204
public class Account {
	private int id=0;
	protected double balance=0.0;
	protected double annualInterestRate=0.0;
	private java.util.Date dateCreated;
	
	public Account(){
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	// set and get functions
	public void setId(int id){this.id = id;}
	public int getId(){ return id;}
	public void setBalance(double balance){ this.balance = balance;}
	public double getBalance(){ return balance;}
	public void setInterestRate(double interest){this.annualInterestRate = interest;}
	public double getMonthlyInterest(){ return annualInterestRate;}
	public java.util.Date getDate(){ return dateCreated;}
	
	public String withDraw(double withdrawal){
		String result;
		if (withdrawal > balance){
			result = "unable to make withdrawal";
			return result;
		} else {
			balance -= withdrawal;
			result = "able to make withdrawal. Balance is currently " + balance;
			return result;
		}
		}
	
	public String toString(){
		String r = "This is a bank account which has an id" +
						" and contains a balance, interest rate," +
						" and a Date created.";
		return r;
	}
}
	
	


