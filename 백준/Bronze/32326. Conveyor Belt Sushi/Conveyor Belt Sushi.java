import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cost = Integer.parseInt(br.readLine())*3 +
				Integer.parseInt(br.readLine())*4 +
				Integer.parseInt(br.readLine())*5;
		
		bw.write(Integer.toString(cost));
		
		br.close();
		bw.flush();
		bw.close();
	}
}