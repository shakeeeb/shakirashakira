package shakirashakira;

import java.lang.StringBuilder;
public class Lab25 {
	public static void main(String[] args){
		// displayPermuation("abcde");
		System.out.print(recSumDigits(120));
		tartan(3);
	}
	public static void displayPermuation(String s) {
		displayPermuation("", s);
		}
		public static void displayPermuation(String s1, String s2) {
		if (s2.length() > 0) {
		for (int i = 0; i < s2.length(); i++) {
		displayPermuation(s1 + s2.charAt(i), 
		s2.substring(0, i) + s2.substring(i + 1));// you need to draw a diagram to really understand how it plays out through each passing
		}} // doesnt emulate for loops with iteration. stacks, and then outputs from final point using for loops to go through each permutation
		else
		System.out.println(s1);
		}
	
	public static int recSumDigits(int num){
		int result = 0;
		int extNum = 0;
		if (num == 0){
			return 0;
		} else {
			extNum = num%10;
			return extNum + recSumDigits(num/10);
		}
	}
	
	public static int factorial(int n){
		if (n <= 1){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void tartan(int n){
		rec_TartanCol(n, 1);
	}
	public static void rec_TartanCol(int n, int i){
		if(i==n+1){
			return;
		} else {
			rec_TartanRow(n, i, 1);
			rec_TartanCol(n, i+1);
		}
	}
	public static void rec_TartanRow(int n, int i, int j){
		if (n+1==j){
			System.out.println();
			return;
		} else {
			if ((i+j)%2 != 0) System.out.print(n); else System.out.print(n-1);
		} rec_TartanRow(n, i, j+1);
	}
	
	

}
