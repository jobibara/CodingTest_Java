import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int third = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		
		int[] arr = new int[3];
		
		arr[0] = third * 4 + second * 2;
		arr[1] = third * 2 + first * 2;
		arr[2] = first * 4 + second * 2;
		
		Arrays.sort(arr);
		
		bw.write(Integer.toString(arr[0]));
		bw.flush();
		
		
	}
}
