import java.util.Arrays;
import java.util.HashMap;


public class fourteen {

	/**
	 * @param args
	 */
	static int max, num;
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		getMax();
	}

	private static void getMax() {
		int sequence, sequenceLength = Integer.MIN_VALUE, startingNumber = 0;
		int cache[] = new int[1000001];
		Arrays.fill(cache, -1);
		for (int i = 2; i <= 1000000; i++) {
//		    sequence = i;
//		    int k = 0;
//		    while (sequence != 1 && sequence >= i) {
//		        k++;
//		        if ((sequence % 2) == 0) {
//		            sequence = sequence / 2;
//		        } else {
//		            sequence = sequence * 3 + 1;
//		        }
//		    }
//		    //Store result in cache
//		    cache[i] = k + cache[sequence];
//		 
//		    //Check if sequence is the best solution
//		    if (cache[i] > sequenceLength) {
//		        sequenceLength = cache[i];
//		        startingNumber = i;
//		    }
			
			
			
			
			
			int length = 1;
		    sequence = i;
		    while (sequence != 1) {
		        if ((sequence % 2) == 0) {
		            sequence = sequence / 2;
		        } else {
		            sequence = sequence * 3 + 1;
		        }
		        length++;
		    }
		 
		    //Check if sequence is the best solution
		    if (length > sequenceLength) {
		        sequenceLength = length;
		        startingNumber = i;
		    }
		}
		System.out.println(startingNumber + " " + sequenceLength);
	}


}
