package shakirashakira;
import java.util.Scanner;

public class Checkboard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			if (!(i%2 == 0)) {
				for(int q = 1; q<=n; q++) {
					if (!(q%2 == 0))
					System.out.print("*");
					else 
						System.out.print(" ");
				}	
			}
			else {
				for (int a = 1; a <= n; a++) {
					if (!(a%2 == 0))
					System.out.print(" ");
					else 
						System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		RecursiveCheckboard(n); //Bottom one.
	}
	public static void Checkboard(int n) {
		// base case: n = 1
		if (n == 1) {
			System.out.print("*");
		} 
	}
	public static void RecursiveCheckboard(int n){  
		 RecursiveCheckboard2(1,n); 
		 } 
		 public static void RecursiveCheckboard2(int i, int n){ // iterates to the next line
		 if(i==n+1){ 
		 return; 
		 }else{ 
		 RecursiveCheckboard3(i,1,n); 
		RecursiveCheckboard2(i+1,n); 
		 } 
		 }
		 public static void RecursiveCheckboard3(int i, int j, int n){ // iterates through the line
		 if(j==n+1){ // this is because it increments after finishing everything
		 System.out.println(); // end the line and begin a new line
		 return; 
		 }else{            // if its even, then * else ' ' 
		System.out.print(((i+j)%2==0?"0":"1")); // if statement
		 RecursiveCheckboard3(i,j+1,n); 
		 }
		 }

}
