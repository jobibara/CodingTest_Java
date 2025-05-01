import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cardO = M;
		int cardX = N - M;
		
		int checkO = K;
		int checkX = N-K;
		
		int result = 0;
		
		if(cardO > checkO) {
			result = checkO + cardX;
			
		}
		
		else if(cardO < checkO) {
			result = cardO + checkX;
			
		}
		
		else if(cardO == checkO) {
			result = N;
			
		}
		else {
			bw.write("Error");
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
	}
}
