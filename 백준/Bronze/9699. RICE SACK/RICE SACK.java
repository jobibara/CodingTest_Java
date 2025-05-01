import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int max = 0;
			
			for(int j = 0; j<5; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp > max) {
					max = temp;
				}
			}
			
			bw.write("Case #"+Integer.toString(i+1)+": "+Integer.toString(max)+"\n");
		}
		
		bw.flush();
	}
}
