import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int HSR = Integer.parseInt(br.readLine());
		int FLI = Integer.parseInt(br.readLine());
		
		if(HSR <= FLI) {
			bw.write("high speed rail");
		}
		else {
			bw.write("flight");
		}
		
		bw.flush();
		bw.close();
	}
}
