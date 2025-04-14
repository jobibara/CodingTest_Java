import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		int result;
		
		if(start >= 20) {
			result = (24-start) + end;
		}
		else {
			result = end - start;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
	}
}