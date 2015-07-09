package shakirashakira;


public class Homework13 {
	
	public static String binaryToDec(String s){
		String result;
		int[] hold = new int[s.length()];
		for (int i=0; i <s.length()-1; i++){
			hold[i] = s.charAt(i)-'0';	
		}
		for(int i = 0; i<hold.length/2; i++){
			int temp = hold[i];
			hold[i]= hold[hold.length-1 -i];
			hold[hold.length-1 -i] = temp;
		}
		int max;
		max=s.length();
		int doodle = max-1;
		int intResult = 0;
		for(int i = max-1; i > -1; i--){
			intResult+=(Math.pow(2, doodle)*hold[i]);
			doodle--;	
		}
		result = Integer.toString(intResult);
		return result;
	}

	public static void main(String[] args) {
		String n = "1000101110";
		
		String l = binaryToDec(n);
		System.out.print(l);
	

	}

}
