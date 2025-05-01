import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		
		int[] sci = new int[4];
		int[] soc = new int[2];
		
		for(int i = 0; i<4; i++) {
			sci[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i<2; i++) {
			soc[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(sci);
		Arrays.sort(soc);
		
		for(int i = 1; i<4; i++) {
			sum += sci[i];
		}
		sum += soc[1];
		
		bw.write(Integer.toString(sum));
		bw.flush();
	}
}
