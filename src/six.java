
public class six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		System.out.println(ans(n));
	}

	private static int ans(int n) {
		int sumOfSquares = (n*(n+1)*(2*n+1))/6;
		int squareOfSums = (int) Math.pow((n*(n+1))/2, 2);
		return squareOfSums - sumOfSquares;
	}

}
