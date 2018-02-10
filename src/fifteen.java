import java.util.Arrays;


public class fifteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 20;
		System.out.println(paths(n));
	}

	private static long paths(int n) {
		long arr[][] = new long[n+1][n+1];
		int i, j;
		for(i = 0; i < n; i++){
			arr[i][n] = 1;
			arr[n][i] = 1;
		}
		for(i = n-1; i >= 0; i--){
			for(j = n-1; j >= 0; j--)
				arr[i][j] = arr[i][j+1] + arr[i+1][j];
		}
		for(long[] ans: arr)
			System.out.println(Arrays.toString(ans));
		return arr[0][0];
	}

}
