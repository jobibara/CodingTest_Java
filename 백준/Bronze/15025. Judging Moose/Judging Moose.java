import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a > b) {
			bw.write("Odd " + Integer.toString(a*2));
		}
		else if(a < b) {
			bw.write("Odd " + Integer.toString(b*2));
		}
		else {
			if(a == 0) {
				bw.write("Not a moose");
			}
			else {
				bw.write("Even " + Integer.toString(a*2));
			}
			
		}
		
		bw.flush();
	}
}