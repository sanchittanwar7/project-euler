
public class four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer prod;
		int max = Integer.MIN_VALUE;
		for(int i = 999; i > 99; i--){
			for(int j = 999; j > 99; j--){
				prod = new Integer(i*j);
				if(isPalindrome(prod.toString())){
					if(i*j > max)
						max = i*j;
				}
			}
		}
		System.out.println(max);
	}
	
	private static boolean isPalindrome(String str) {
		if(str.length() <= 1)
			return true;
		if(str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		return isPalindrome(str.substring(1, str.length() - 1));
	}

}
