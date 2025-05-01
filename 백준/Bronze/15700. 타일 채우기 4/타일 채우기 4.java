import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long row = Long.parseLong(st.nextToken());
		Long col = Long.parseLong(st.nextToken());
		
		bw.write(Long.toString((row*col)/2));
		
		bw.flush();
	}
}
