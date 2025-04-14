import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ampere = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		if(ampere <= Integer.parseInt(st.nextToken())/Integer.parseInt(st.nextToken())) {
			bw.write(Integer.toString(1));
		}
		else {
			bw.write(Integer.toString(0));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}