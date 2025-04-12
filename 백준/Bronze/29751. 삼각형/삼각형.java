import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double W = Double.parseDouble(st.nextToken());
		Double H = Double.parseDouble(st.nextToken());
		
		System.out.println(W*H/2);
	}
}