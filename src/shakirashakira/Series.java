package shakirashakira;
import java.math.BigDecimal;
import java.math.MathContext;
//109239204
public class Series {public static void main(String[] args) {
	for (int i = 1; i <= 100; i++) {
		BigDecimal bleh = new BigDecimal(i);
		System.out.println("f(" + i + "): " + compute(bleh));
	}
}
public static BigDecimal compute(BigDecimal n) {
BigDecimal negOne = new BigDecimal(-1);
BigDecimal one = new BigDecimal(1);
MathContext mc = new MathContext(2);
BigDecimal two = new BigDecimal(2);
BigDecimal zero = new BigDecimal(0);
// base case
if (n.compareTo(one) == 0) {return new BigDecimal(1);}
else {
	if((n.remainder(two,mc).compareTo(zero)) == 0) {
		BigDecimal bloo = n.multiply(negOne);
		BigDecimal bleeg = one.divide(bloo, 20, BigDecimal.ROUND_UP);
		return compute(n.subtract(one)).add(bleeg);
	}
	else {
		BigDecimal rugh = one.divide(n, 20, BigDecimal.ROUND_UP);
		return compute(n.subtract(one)).add(rugh);
	}
}
}

}
