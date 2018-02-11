
public class seventeen {

	/**
	 * @param args
	 */
	
	static boolean skipNext = false;
	
	public static void main(String[] args) {
		int n = 1000;
		System.out.println(len(n));
//		System.out.println(" length : " + getAns(65));
	}

	private static int len(int n) {
		int  len = 0, ans;
		for(int i = 1; i < n; i++){
			ans = getAns(i);
			len += ans;
			System.out.println(" ans : " + ans);
		}
		return len + 11;
	}

	private static int getAns(int i) {
		int pow, temp, ans;
		temp = i;
		pow = 2;
		ans = 0;
		System.out.print("num : " + temp);
		while(pow >= 0){
			ans += getLength((int)(temp/Math.pow(10, pow)), pow);
			if(skipNext){
				skipNext = false;
				temp %= Math.pow(10, pow);
				if(temp == 0)
					ans += 3;
				else if(temp == 1)
					ans += 6;
				else if(temp == 2)
					ans += 6;
				else if(temp == 3)
					ans += 8;
				else if(temp == 4)
					ans += 8;
				else if(temp == 5)
					ans += 7;
				else if(temp == 6)
					ans += 7;
				else if(temp == 7)
					ans += 9;
				else if(temp == 8)
					ans += 8;
				else if(temp == 9)
					ans += 8;
				pow--;

			}
			temp %= Math.pow(10, pow);
			pow--;
		}
		return ans;
	}

	private static int getLength(int d, int pow) {
		if(d == 0)
			return 0;
		if(pow == 2){
			if(d == 1)
				return 13;
			else if(d == 2)
				return 13;
			else if(d == 3)
				return 15;
			else if(d == 4)
				return 14;
			else if(d == 5)
				return 14;
			else if(d == 6)
				return 13;
			else if(d == 7)
				return 15;
			else if(d == 8)
				return 15;
			else if(d == 9)
				return 14;
		}
		else if(pow == 1){
			if(d == 1){
				skipNext = true;
				return 0;
			}
			else if(d == 2)
				return 6;
			else if(d == 3)
				return 6;
			else if(d == 4)
				return 5;
			else if(d == 5)
				return 5;
			else if(d == 6)
				return 5;
			else if(d == 7)
				return 7;
			else if(d == 8)
				return 6;
			else if(d == 9)
				return 6;
		}
		else if(pow == 0){
			if(d == 1)
				return 3;
			else if(d == 2)
				return 3;
			else if(d == 3)
				return 5;
			else if(d == 4)
				return 4;
			else if(d == 5)
				return 4;
			else if(d == 6)
				return 3;
			else if(d == 7)
				return 5;
			else if(d == 8)
				return 5;
			else if(d == 9)
				return 4;
		}
		return 0;
	}


}
