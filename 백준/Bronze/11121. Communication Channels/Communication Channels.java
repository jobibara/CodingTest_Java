import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i<N; i++) {
			boolean result = true;
			
			st = new StringTokenizer(br.readLine());
			
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			for(int j = 0; j<str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(j)) {
					result = false;
					break;
				}
			}
			
			if(result == true) {
				bw.write("OK\n");
			}
			else {
				bw.write("ERROR\n");
			}
		}
		
		bw.flush();
	}
}