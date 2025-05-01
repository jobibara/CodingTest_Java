import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i<N; i++) {
			char[] arr = new char[len];
			String str = br.readLine();
			
			for(int j = 0; j<len; j++) {
				arr[j] = str.charAt(j);
			}
			
			for(int j = len-1; j>-1; j--) {
				bw.write(arr[j]);
			}
			
			bw.write("\n");
		}
		bw.flush();
	}
}
