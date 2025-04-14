import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());
		
		if(B/2 <= A) {
			bw.write("E");
			}
		else {
			bw.write("H");
		}
		
		bw.flush();
	}
}
