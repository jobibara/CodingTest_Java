import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double p1 = Double.parseDouble(st.nextToken());
		Double q1 = Double.parseDouble(st.nextToken());
		Double p2 = Double.parseDouble(st.nextToken());
		Double q2 = Double.parseDouble(st.nextToken());
		
		double temp = p1*p2/q1/q2/2;
		//bw.write(Double.toString(temp)+"\n");
		
		if(temp >= 1 && temp % 1 == 0.0) {
			bw.write("1");
		}
		else {
			bw.write("0");
		}
		
		bw.flush();
	}
}
