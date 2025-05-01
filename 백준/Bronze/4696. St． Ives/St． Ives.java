import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			Double N = Double.parseDouble(br.readLine());
			
			if(N == 0) {
				break;
			}
			
			double sum = 1;
			sum += N;
			sum += N*N;
			sum += N*N*N;
			sum += N*N*N*N;
			
			bw.write(String.format("%.2f", sum)+"\n");
		}
		bw.flush();
	}
}
