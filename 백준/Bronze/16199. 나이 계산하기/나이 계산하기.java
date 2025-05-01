import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] birth = new int[3];
		int[] today = new int[3];
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<3; i++) {
			birth[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<3; i++) {
			today[i] = Integer.parseInt(st.nextToken());
		}
		
		if( (birth[1]*100) + birth[2] <= (today[1]*100) + today[2]) {
			bw.write(Integer.toString(today[0] - birth[0]) + "\n");
		}
		else {
			bw.write(Integer.toString(today[0] - birth[0] - 1) +"\n");
		}
		
		bw.write(Integer.toString(today[0] - birth[0] + 1) + "\n");
		
		bw.write(Integer.toString(today[0] - birth[0]));
		
		bw.flush();
		
	}
}
