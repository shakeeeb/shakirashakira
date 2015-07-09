package shakirashakira;
// Shakeeb Saleh, 109239204
public class MyInteger {
	private int myInt;
	
	public MyInteger(int deathgrips){
		myInt = deathgrips;
	}
	
	public int getMyInt(){
		return myInt;
	}
	// is Even functions
	public boolean isEven(){
		if(myInt%2 == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEven(int theInt){
		if(theInt%2 == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEven(MyInteger bloo){
		if(bloo.myInt%2 == 0){
			return true;
		} else {
			return false;
		}
	}
	// is Odd functions
	public boolean isOdd(){
		if(myInt%2 == 1){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOdd(int theInt){
		if(theInt%2 == 1){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger bloo){
		if (bloo.myInt%2 == 1){
			return true;
		} else {
			return false;
		}
	}
	// is Prime functions
	public boolean isPrime(){
		if (myInt%2 == 0){
			return false;
		}
		for(int i =3; i*i<=myInt; i+=2){
			if(myInt%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int n){
		if(n%2 == 0){
			return false;
		}
		for(int i =3; i*i<=n; i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger bloo){
		if(bloo.myInt%2==0){
			return false;
		}
		for(int i=0; i*i <= bloo.myInt; i+=2){
			if (bloo.myInt%i==0)
				return false;
		}
		return true;
	}
	// equals
	public boolean equals(int n){
		if(myInt == n)
			return true;
		else 
			return false;
	}
	
	public boolean equals(MyInteger bloo){
		if(bloo.myInt==myInt)
			return true;
		else 
			return false;
	}
	
	public static int parseInt(String s){
		int result = 0;
		for (int i=0; i <s.length(); i++){
			result = result*10;
			int digit = ((int)s.charAt(i)) - ((int)('0'));
			result=result+digit;
		}
		return result;	
	}

}
