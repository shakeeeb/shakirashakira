package shakirashakira;
//shakeeb 109239204
public class IllegalTriangleException extends Exception{
	String message;
	
	public IllegalTriangleException(double side1, double side2, double side3){
		message = side1 + "," + side2 + ", " + side3+ "isnt a valid triangle"; 
			
		}
		
	public String toString(){
		return message;
	}
	}
	
