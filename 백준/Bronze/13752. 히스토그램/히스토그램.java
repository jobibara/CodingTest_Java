import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int j = 0; j<n; j++) {
				bw.write("=");
			}
			bw.write("\n");
			
		}
		bw.flush();
	}
}
