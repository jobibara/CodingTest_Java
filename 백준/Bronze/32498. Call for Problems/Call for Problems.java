import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int min = 9999;
		int result = 0;
		
		for(int i = 0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp%2 == 1) {
				result++;
			}
		}
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}
}
