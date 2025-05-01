import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 91;
		
		for(int i = 0; i<3; i++) {
			if(i%2 == 0) {
				sum += 1*Integer.parseInt(br.readLine());
			}
			else {
				sum += 3*Integer.parseInt(br.readLine());
			}
		}
		bw.write("The 1-3-sum is ");
		bw.write(Integer.toString(sum));
		bw.flush();
	}
}
