import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp%2 == 0) {
				bw.write(Integer.toString(temp)+" is even\n");
			}
			else {
				bw.write(Integer.toString(temp)+" is odd\n");
			}
		}
		
		bw.flush();
	}
}
