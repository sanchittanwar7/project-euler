import java.math.BigInteger;


public class twenty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger num = new BigInteger("100");
		System.out.println(sumOfFact(num));
	}

	private static int sumOfFact(BigInteger num) {
		String ans;
		int sum = 0;
		BigInteger fact = new BigInteger("1");
		BigInteger dec = new BigInteger("1");
		while(num.compareTo(new BigInteger("1")) != -1){
			System.out.println(num);
			fact = fact.multiply(num);
			num = num.subtract(dec);
		}
		ans = fact.toString();
		for(int i = 0; i < ans.length(); i++)
			sum += (ans.charAt(i) - 48);
		return sum;
	}

}
