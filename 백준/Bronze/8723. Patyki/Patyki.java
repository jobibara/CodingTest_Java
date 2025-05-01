import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a == b && b == c && c == a) {
			bw.write("2");
		}
		else {
			if(a > b && a > c) {
				if(a*a == b*b + c*c) {
					bw.write("1");
				}
				else {
					bw.write("0");
				}
			}
			
			else if(b > a && b > c) {
				if(b*b == a*a + c*c) {
					bw.write("1");
				}
				else {
					bw.write("0");
				}
			}
			
			else if(c > a && c > b) {
				if(c*c == a*a + b*b) {
					bw.write("1");
				}
				else {
					bw.write("0");
				}
			}
			
			else {
				bw.write("0");
			}
		}
		bw.flush();
	}
}