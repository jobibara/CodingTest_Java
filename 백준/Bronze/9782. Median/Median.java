import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int cnt = 1;
		while(true) {
		
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			
			if(N == 0) 
				break;
			
			
			Double[] arr = new Double[N];
			
			for(int j = 0; j<N; j++) {
				arr[j] = Double.parseDouble(st.nextToken());
			}
			
			double result;
			
			if(N%2 == 0) {
				double a = arr[N/2-1];
				double b = arr[N/2];
				
				result = (a+b)/2;
			}
			else {
				result = arr[N/2];
			}
			
			bw.write("Case "+ cnt++ + ": "+Double.toString(result)+"\n");
		}
		bw.flush();
	}
}