package shakirashakira;
import java.util.Scanner;
// Shakeeb Saleh 109239204
public class SavingsAccount extends Account {

	public SavingsAccount(){
		super();
	}
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
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
		String result = " This is a savings account which holds"+
						" an id, a balance, an interest rate, and a" +
						" date created.";
		return result;
	}
}
