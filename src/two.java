
public class two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1, b = 2, c;
		long sum = 0;
		while(b < 4000000){
			if(b%2 == 0)
				sum += b;
			c = b + a;
			a = b;
			b = c;
		}
		System.out.println(sum);
	}

}
