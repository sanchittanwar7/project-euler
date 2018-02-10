
public class twelve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int i = 1, num, count;
		while(true){
			num = (i*(i+1))/2;
			count = 0;
			for(int j = 1; j <= Math.sqrt(num); j++){
				if(num%j == 0){
					System.out.print(j + " " + num/j + " ");
					count+=2;
				}
			}
			System.out.println();
			if(count > 500)
				break;
			i++;
		}
		System.out.println("ans = " + num);
	}

}
