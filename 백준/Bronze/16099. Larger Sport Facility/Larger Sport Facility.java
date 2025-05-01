import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			Long temp1 = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			Long temp2 = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			
			if(temp1 > temp2) {
				bw.write("TelecomParisTech\n");
			}
			else if(temp1 < temp2) {
				bw.write("Eurecom\n");
			}
			else {
				bw.write("Tie\n");
			}
		}
		
		bw.flush();
	}
}
