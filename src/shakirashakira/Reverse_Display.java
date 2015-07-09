package shakirashakira;
// shakeeb saleh 109239204
public class Reverse_Display {
	public static void main(String[] args) {
		reverseDisplay(54321);
	}
	public static void reverseDisplay(int n) {
		if (n % 10 == n) {
			System.out.print(n);
		}
		else {
			System.out.print((n%10));
			int new_value = n/10;
			reverseDisplay(new_value);
		}
	}
}
