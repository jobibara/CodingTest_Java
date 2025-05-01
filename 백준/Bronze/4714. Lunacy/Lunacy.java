import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			Double N = Double.parseDouble(br.readLine());
			
			if(N < 0) {
				break;
			}
			
			Double temp = N*0.167;
			
			String strN = String.format("%.2f", N);
			String strTemp = String.format("%.2f", temp);
			
			bw.write("Objects weighing "+ strN +" on Earth will weigh "+strTemp+" on the moon.\n");
		}
		
		bw.flush();
	}
}
