package shakirashakira;
// Shakeeb Saleh, 109239204
public class Homework13pt2 {
	public static int[] count(String s){
		int result[] = new int[10];
		for(int i= 0; i < s.length(); i++){
			char a = s.charAt(i);
			switch(a){
			case '0': result[0]++;
				break;
			case '1': result[1]++;
				break;
			case '2': result[2]++;
				break;
			case '3': result[3]++;
				break;
			case '4': result[4]++;
				break;
			case '5': result[5]++;
				break;
			case '6': result[6]++;
				break;
			case '7': result[7]++;
				break;
			case '8': result[8]++;
				break;
			case '9': result[9]++;
				break;
			default: break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
