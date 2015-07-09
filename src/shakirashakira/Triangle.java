package shakirashakira;
//shakeeb 109239204
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
	{
		if((side1 + side2 < side3) ||
			(side1 + side3 < side3) ||
			(side2 + side3 < side1)){
			this.side1 = side1;
			this.side1 = side1;
			this.side1 = side1;	
		} else {throw new IllegalTriangleException(side1, side2, side3);}
		} 
	public double get1(){
		return side1;
	}
	public double get2(){
		return side2;
	}
	public double get3(){
		return side3;
	}
	public double getPerimeter() {
	     return side1 + side2 + side3 ;
	}
	public double getArea() {
	     double p = getPerimeter() / 2;
	     return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

}
