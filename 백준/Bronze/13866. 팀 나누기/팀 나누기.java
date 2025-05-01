import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[4];
		
		for(int i = 0; i<4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int temp = arr[0]+arr[3] - arr[1]-arr[2];
		if(temp < 0) {
			temp = temp*-1;
		}
		
		bw.write(Integer.toString(temp));
		
		bw.flush();
	}
}