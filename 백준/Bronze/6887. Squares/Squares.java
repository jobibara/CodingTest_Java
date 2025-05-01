import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int i = 1;
		
		while(true) {
			int temp = i*i;
			
			if(temp > N) {
				bw.write("The largest square has side length "+Integer.toString(i-1)+".");
				break;
			}
			else if(temp == N) {
				bw.write("The largest square has side length "+Integer.toString(i)+".");
				break;
			}
			else {
				i++;
			}
		}
		bw.flush();
	}
}
