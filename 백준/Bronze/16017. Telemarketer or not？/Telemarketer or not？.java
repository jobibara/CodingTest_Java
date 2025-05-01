import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[4];
		
		for(int i = 0; i<4; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		if(num[0] == 8 || num[0] == 9) {
			if(num[3] == 8 || num[3] == 9) {
				if(num[1] == num[2]) {
					bw.write("ignore");
				}
				else {
					bw.write("answer");
				}
			}
			
			else {
				bw.write("answer");
			}
		}
		
		else {
			bw.write("answer");
		}
		
		bw.flush();
	}
}
