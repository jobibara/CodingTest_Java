import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] arr = new String[5];
		
		for(int i = 0; i<5; i++) {
			arr[i] = st.nextToken();
			
		}
		
		if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
			bw.write("YES");
		}
		else {
			bw.write("NO");
		}
		
		bw.flush();
	}
}
