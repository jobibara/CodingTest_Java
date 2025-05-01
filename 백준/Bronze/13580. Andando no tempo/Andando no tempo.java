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
		
		if(a == b || b == c || c == a) {
			bw.write("S");
		}
		else if(a+b == c || b+c == a || c+a == b) {
			bw.write("S");
		}
		else {
			bw.write("N");
		}
		bw.flush();
	}
}
