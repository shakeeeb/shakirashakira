package shakirashakira;
//Shakeeb Saleh 109239204
public class Homework13pt5 {
	public static String sort(String s){
		char[] array;
		array = s.toCharArray();
		boolean flag = true;
		char temp;
		while(flag){
		flag = false;
		for (int j=0; j<array.length-1; j++){
			if(array[j]<array[j+1]){
				temp = array[j];
				array[j] = array[j+1];
				array[j+1]=temp;
				flag = true;
			}
		}
		}
		String b = new String(array);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
