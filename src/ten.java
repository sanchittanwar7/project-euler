
public class ten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 2000000;
		System.out.println(ans(n));
	}

	private static long ans(int n) {
		long sum = 0;
		for(int i = 2; i < n; i++)
			if(seven.isPrime(i))
				sum += i;
		return sum;
	}

}
