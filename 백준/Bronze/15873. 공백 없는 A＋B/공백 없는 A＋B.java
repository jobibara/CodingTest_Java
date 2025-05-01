import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		
		if(num.length() == 2) {
			int a = Character.getNumericValue(num.charAt(0));
			int b = Character.getNumericValue(num.charAt(1));
			
			bw.write(Integer.toString(a+b));
		}
		
		else if(num.length() == 3) {
			int a = Character.getNumericValue(num.charAt(0));
			int b = Character.getNumericValue(num.charAt(1));
			int c = Character.getNumericValue(num.charAt(2));
			
			int temp1 = a*10 + b;
			int temp2 = b*10 + c;
			
			if(temp1 > 10) {
				bw.write(Integer.toString(temp2 + a));
			}
			
			else {
				bw.write(Integer.toString(temp1 + c));
			}
			
		}
		
		else if(num.length() == 4) {
			bw.write(Integer.toString(20));
		}
		
		else {
			bw.write("Error");
		}
		bw.flush();
		
	}
}
