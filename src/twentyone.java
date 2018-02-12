
public class twentyone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10000;
		System.out.println(sumOfAmicableNumber(n));
	}

	private static int sumOfAmicableNumber(int n) {
		int ans = 0, i, sumOfDivisors;
		for(i = 1; i <= n; i++){
			sumOfDivisors = getSum(i);
			if(i == getSum(sumOfDivisors) && i != sumOfDivisors)
				ans += (i + sumOfDivisors);
		}
		return ans/2;
	}

	private static int getSum(int n) {
		int i = 1, sum = 0;
		for(; i < n; i++){
			if(n%i == 0)
				sum += i;
		}
		return sum;
	}

}
