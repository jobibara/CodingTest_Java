import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int result = M + (M-Y);
		
		bw.write(Integer.toString(result));
		bw.flush();
	}
}
