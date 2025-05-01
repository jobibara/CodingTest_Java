import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] food = new int[3];
		
		StringTokenizer st;
		
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<3; i++) {
			food[i] = Integer.parseInt(st.nextToken());
		}
		
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<3; i++) {
			int temp = food[i] - Integer.parseInt(st.nextToken());
			
			if(temp < 0) {
				sum += temp;
			}
		}
		
		bw.write(Integer.toString(-sum));
		bw.flush();
		
	}
}
