import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		bw.write("Gnomes:\n");
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a > b) {
				if(b > c) {
					bw.write("Ordered\n");
				}
				else {
					bw.write("Unordered\n");
				}
			}
			else if(a < b) {
				if(b < c) {
					bw.write("Ordered\n");
				}
				else {
					bw.write("Unordered\n");
				}
			}
			else {
				bw.write("Unordered\n");
			}
		}	
		bw.flush();
	}
}
