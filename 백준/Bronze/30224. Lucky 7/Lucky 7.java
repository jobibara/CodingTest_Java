import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		
		boolean isContain = false;
		boolean isDivision = false;
		
		for(int i = 0; i<N.length(); i++) {
			if(N.charAt(i) == '7') {
				isContain = true;
				break;
			}
		}
		
		int temp = Integer.parseInt(N);
		
		if(temp%7 == 0) {
			isDivision = true;
		}
		
		if(isContain == true) {
			if(isDivision == true) {
				bw.write("3");
			}
			else {
				bw.write("2");
			}
		}
		else {
			if(isDivision == true) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
		}
		
		bw.flush();		
	}
}
