import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int[] people = new int[4];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<4; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i<4; i++) {
			if(people[i] == x) {
				bw.write(Integer.toString(i+1));
				break;
			}
			else {
				
			}
			
			if(i == 3) {
				bw.write("0");
			}
		}
		bw.flush();
	}
}