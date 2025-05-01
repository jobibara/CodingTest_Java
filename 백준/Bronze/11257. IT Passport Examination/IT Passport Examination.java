import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String num = st.nextToken();
			
			Double a = Double.parseDouble(st.nextToken());
			Double b = Double.parseDouble(st.nextToken());
			Double c = Double.parseDouble(st.nextToken());
			
			String sum = String.format("%.0f", a+b+c);
			
			if(a+b+c >= 55 && a >= 10.5 && b >= 7.5 && c >= 12) {
				bw.write(num+" "+sum+" PASS\n");
			}
			else {
				bw.write(num+" "+sum+" FAIL\n");
			}
		}
		
		bw.flush();
				
	}
}
