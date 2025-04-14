import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			sb.append("LoveisKoreaUniversity ");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
