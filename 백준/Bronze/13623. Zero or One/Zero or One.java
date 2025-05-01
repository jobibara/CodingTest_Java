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
		
		if(a == b && b == c) {
			bw.write("*");
		}
		else if(a == b && a != c) {
			bw.write("C");
		}
		else if(a == c && a != b) {
			bw.write("B");
		}
		else if(b == c && b != a) {
			bw.write("A");
		}
		else {
			bw.write("*");
		}
		
		bw.flush();
	}
}
