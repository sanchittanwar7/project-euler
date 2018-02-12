import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class twentytwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str[] = null;
		try {
			str = readFile("/home/sanchit/Desktop/p022_names.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(int i = 0; i < str.length; i++)
//			System.out.println(str[i]);
		Arrays.sort(str);
		for(int i = 0; i < str.length; i++){
			System.out.println(str[i] + " " + (i+1));
//			if(str[i].equals("COLIN"))
//				System.out.println((i+1));
		}
		System.out.println(str.length);
		String test[] = {"DEF", "ABC"};
		System.out.println(getLength(str));
	}



	private static long getLength(String[] str) {
		int  i, j, sum;
		long ans = 0;
		for(i = 0; i < str.length; i++){
			sum = 0;
			for(j = 0; j < str[i].length(); j++)
				sum += (str[i].charAt(j) - 64);
			ans += ((i+1)*sum);
		}
		return ans;
	}



	private static String[] readFile(String file) throws IOException {
		FileReader fr =	new FileReader(file);
		String ans[] = new String[5162], str = "";
		int i, pos = 0;
		while ((i=fr.read()) != -1){
			if((char)i == ','){
				ans[pos] = str;
				str = "";
				pos++;
			}
			else if((char)i != '"'){
				str += (char)i;
			}
		}
		fr.close();
		System.out.println(pos);
		return ans;
	}
}


