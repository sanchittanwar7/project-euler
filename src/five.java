
public class five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long input[] = new long[20];
		for(int i = 0; i < 20; i++)
			input[i] = i+1;
		System.out.println(lcm(input));
		
	}
	
	private static long lcm(long a, long b){
	    return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input){
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
	private static long gcd(long a, long b){
	    while (b > 0){
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

}
