package shakirashakira;
// Shakeeb Saleh, 109239204
public class MyPoint {
	private int x=0;
	private int y=0;
	
	public MyPoint(){	
	}
	
	public MyPoint(int spam, int eggs){
		x=spam;
		y=eggs;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public double distance(MyPoint bloo){
		double result = 0;
		result = Math.sqrt(Math.pow(bloo.x - this.x, 2)+(Math.pow(bloo.y - this.y, 2)));
		return result;
	}
	
	public double distnce(MyPoint bloo, int x1, int y1){
		double result = 0;
		result = Math.sqrt(Math.pow(bloo.x-x1, 2)+(Math.pow(bloo.y-y1, 2)));
		return result;
	}
}
