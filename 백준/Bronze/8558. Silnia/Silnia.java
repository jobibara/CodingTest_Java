import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = 1;
		
		for(int i = 1; i<=N; i++) {
			sum *= i;
		}
		
		bw.write(Integer.toString(sum%10));
		bw.flush();
	}
}
