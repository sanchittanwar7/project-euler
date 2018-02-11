import java.util.Arrays;


public class eighteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[][] = {{75},
						{95,64},
						{17,47,82},
						{18,35,87,10},
						{20,04,82,47,65},
						{19,01,23,75,03,34},
						{88,02,77,73,07,63,67},
						{99,65,04,28,06,16,70,92},
						{41,41,26,56,83,40,80,70,33},
						{41,48,72,33,47,32,37,16,94,29},
						{53,71,44,65,25,43,91,52,97,51,14},
						{70,11,33,28,77,73,17,78,39,68,17,57},
						{91,71,52,38,17,14,91,43,58,50,27,29,48},
						{63,66,04,68,89,53,67,30,73,16,69,87,40,31},
						{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
		System.out.println(maxCost(arr));
	}

	private static int maxCost(int[][] arr) {
		int r = arr.length, c = arr[r-1].length, cost[][] = new int[r][c], top, topLeft, i, j, max = Integer.MIN_VALUE;
		cost[0][0] = arr[0][0];
		for(i = 1; i < r; i++){
			for(j = 0; j <= i; j++){
				top = i-1 >= 0 && i-1 >= j ? cost[i-1][j] : Integer.MIN_VALUE;
				topLeft = i-1 >= 0 && j-1 >= 0 ? cost[i-1][j-1] : Integer.MIN_VALUE;
				cost[i][j] = arr[i][j] + Math.max(top, topLeft);
				if(cost[i][j] > max)
					max = cost[i][j];
			}
		}
		for(int[] ans : cost)
			System.out.println(Arrays.toString(ans));
		return max;
	}

}
