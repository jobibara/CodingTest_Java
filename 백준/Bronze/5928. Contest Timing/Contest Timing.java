import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int day = Integer.parseInt(st.nextToken()) - 1 - 11;
		int hour = Integer.parseInt(st.nextToken()) + 23 - 11;
		int min = Integer.parseInt(st.nextToken()) + 60 - 11;
		
		int result = day * 1440 + hour * 60 + min;
		
		if(result < 0) {
			bw.write("-1");
		}
		else {
			bw.write(Integer.toString(result));
		}
		
		bw.flush();
	}
}
