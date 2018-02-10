import java.math.BigInteger;


public class sixteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int pow = 1000;
		System.out.println(sumOfDigits(pow));
	}

	private static int sumOfDigits(int pow) {
		BigInteger base = new BigInteger("2"), ans = new BigInteger("1");
		int total = 0;
		for(int i = 0; i < pow; i++){
			ans = ans.multiply(base);
		}
		System.out.println(ans);
		String str = ans.toString();
		for(int i = 0; i < str.length(); i++){
			total += (str.charAt(i) - 48);
		}
		return total;
	}

}
