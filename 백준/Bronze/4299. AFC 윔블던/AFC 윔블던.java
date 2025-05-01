import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int A = (a+b)/2;
		int B = (a-b)/2;
		
		if(A+B != a) {
			bw.write("-1");
		}
		else if(A-B != b) {
			bw.write("-1");
		}
		else if(A < 0) {
			bw.write("-1");
		}
		else if(B < 0) {
			bw.write("-1");
		}
		else {
			bw.write(Integer.toString(A) +" " + Integer.toString(B));
		}
		
		
		bw.flush();
	}
}
