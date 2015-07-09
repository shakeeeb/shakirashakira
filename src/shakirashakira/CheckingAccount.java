package shakirashakira;
import java.util.Scanner;
// Shakeeb Saleh 109239204
public class CheckingAccount extends Account{
	private double overDraftLimit;
	
	public CheckingAccount(){
		super();
	}
	
	public CheckingAccount(int id, double balance, double limit){
		super(id, balance);
		overDraftLimit=limit;
	}
	
	public String withDraw(double withdrawal){
		Scanner input = new Scanner(System.in);
		String result = "";
		String response = "";
		boolean answer = false;
		if (withdrawal > super.getBalance()){ // the user attempts to withdraw...
			if (overDraftLimit > super.getBalance()-withdrawal){ // their withdrawal is over balance, but under limit
				System.out.print("your withdrawal will go over your balance. Would like to go into your overdraft?(y/n)");
				response = input.next();
				if (response.equals("y")){// they agree to overdraft
					super.setBalance(super.getBalance() - withdrawal);
					overDraftLimit -= balance-withdrawal;
					result = "your balance is:" + super.getBalance() + " and your overdraft limit is" + overDraftLimit;
						return result;	
				}	else { result = "Ok, you did not withdraw. your balance is currently "+ balance; return result;}// disagree to overdraft
			} else { result = "Your overdraft limit will not cover your withdrawal. your account stands at " + balance; return result;}	// withdrawal is over limit	
		} else { // withdrawal is within balance
			balance -= withdrawal;
			result = "able to make withdrawal. Balance is currently " + balance;
			return result;
		}
	}
	//setn'get for overDraftLimit
	public void setOverDraftLimit(double limit){
		overDraftLimit=limit;
	}
	public double getOverDraftLimit(){
		return overDraftLimit;
	}
	public String toString(){
		String res = " This is a Checking account.\n As such,"+
					" it contains an id, a balance, an interest rate" +
					" and a date created.\n It also has an overdraft limit" +
					" such that withdraw is extended, and the appropriate" +
					" get and set functions.";
		return res;
	}

}
