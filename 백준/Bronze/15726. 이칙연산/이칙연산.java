import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double a = Double.parseDouble(st.nextToken());
		Double b = Double.parseDouble(st.nextToken());
		Double c = Double.parseDouble(st.nextToken());
		
		Double temp1 = a*b/c;
		Double temp2 = a/b*c;
		
		temp1 = Math.floor(temp1);
		temp2 = Math.floor(temp2);
		
		
		if(temp1 >= temp2) {
			bw.write(String.format("%.0f", temp1));
		}
		else {
			bw.write(String.format("%.0f", temp2));
		}
		
		bw.flush();
	}
}