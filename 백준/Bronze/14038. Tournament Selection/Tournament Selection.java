import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		
		for(int i = 0; i<6; i++) {
			if(br.readLine().equals("W")) {
				cnt++;
			}
		}
		
		if(cnt == 5 || cnt == 6) {
			bw.write("1");
		}
		else if(cnt == 3 || cnt == 4) {
			bw.write("2");
		}
		else if(cnt == 1 || cnt == 2) {
			bw.write("3");
		}
		else {
			bw.write("-1");
		}
		
		bw.flush();
	}
}
