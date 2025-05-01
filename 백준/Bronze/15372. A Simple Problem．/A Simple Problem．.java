import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<t; i++) {
			Long N = Long.parseLong(br.readLine());
			
			bw.write(Long.toString(N*N)+"\n");
		}
		
		bw.flush();
	}
}
