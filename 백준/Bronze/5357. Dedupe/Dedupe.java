import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			String result ="";
			char temp = str.charAt(0);
			
			result += temp;
			
			for(int j = 1; j<str.length(); j++) {
				if(str.charAt(j) != temp) {
					result += str.charAt(j);
					temp = str.charAt(j);
				}
				
			}
			
			bw.write(result+"\n");
		}
		bw.flush();
	}
}
