import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		
		String[] temp = new String[3];
		
		temp[0] = Fun(num);
		int cnt = 0;
		
		while(true) {
			temp[2] = temp[1];
			temp[1] = temp[0];
			temp[0] = Fun(temp[0]);
			
			if(temp[0].equals(temp[1]) && temp[1].equals(temp[2])) {
				bw.write("FA");
				break;
			}
			else {
				
				if(cnt == 100) {
					bw.write("NFA");
					break;
				}
			}
		}
		
		bw.flush();
		
	}
	
	private static String Fun(String num) {
		Character a = num.charAt(0);
		int n = num.length();
		String result = Integer.toString(n * Character.getNumericValue(a));
		
		return result;
	}
}