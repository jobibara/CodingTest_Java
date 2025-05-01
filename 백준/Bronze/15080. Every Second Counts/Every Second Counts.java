import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] present = new int[3];
		int[] future = new int[3];
		int[] result = new int[3];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<3; i++) {
			String temp1 = st1.nextToken();
			String temp2 = st2.nextToken();
			if(temp1.equals(":") ) {
				i--;
				continue;
			}
			
			result[i] = Integer.parseInt(temp2) - Integer.parseInt(temp1);
		}
		
		if(result[2] < 0) {
			result[1]--;
			result[2] += 60;
		}
		
		
		if(result[1] < 0) {
			result[0]--;
			result[1] += 60;
		}
		
		
		if(result[0] < 0) {
			result[0] += 24;
		}
		
		int sum = result[0] * 3600 + result[1] * 60 + result[2];
		
		bw.write(Integer.toString(sum));
		bw.flush();
	}
}