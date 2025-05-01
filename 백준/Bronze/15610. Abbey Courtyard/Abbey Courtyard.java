import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Double N = Double.parseDouble(br.readLine());
		
		Double temp = Math.sqrt(N);
		
		bw.write(String.format("%.8f",temp*4));
		bw.flush();
	}
}
