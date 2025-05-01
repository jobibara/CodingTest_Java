import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			Double x = Double.parseDouble(st.nextToken());
			Double y = Double.parseDouble(st.nextToken());
			
			if(x > 0) {
				if(y > 0) {
					bw.write("Q1\n");
				}
				else if(y < 0) {
					bw.write("Q4\n");
				}
				else {
					bw.write("AXIS\n");
				}
			}
			
			else if(x < 0) {
				if(y > 0) {
					bw.write("Q2\n");
				}
				else if(y < 0) {
					bw.write("Q3\n");
				}
				else {
					bw.write("AXIS\n");
				}
			}
			
			else {
				bw.write("AXIS\n");
				
				if(y == 0) {
					break;
				}
			}

		}
		
		bw.flush();
	}
}
