
public class seven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 10001;
		System.out.println(ans(count));
	}

	private static int ans(int count) {
		int i = 1, c = 1;
		while(c <= count){
			i++;
			if(isPrime(i))
				c++;
		}
		return i;
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++)
			if(num % i == 0)
				return false;
		return true;
	}

}
