package shakirashakira;

public class Stock {
	private String symbol;
	private String name;
	double previousClosingPrice;
	double currentPrice;
	
	/** Overloaded Constructor*/
	public Stock(String theSym, String theName, double pcp, double now){
		symbol = theSym;
		name = theName;
		previousClosingPrice = pcp;
		currentPrice = now;
	}
	
	public double changePercent(){
		double percent = 0;
		percent = (currentPrice - previousClosingPrice)/currentPrice;
		percent = percent*100;
		return percent;
	}
	
	/** Set Functions */
	public void setPreviousClosingPrice(double noided){
		previousClosingPrice = noided;
	}
	
	public void setCurrentPrice(double helix){
		currentPrice = helix;
	}
	
	/** Get Functions */
	public String getSymbol(){
		return symbol;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	
	public double getCurrentPrice(){
		return currentPrice;
	}
	

}
