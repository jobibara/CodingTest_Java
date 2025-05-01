import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Double num = Double.parseDouble(br.readLine());
		
		Double result = 3.785411784 / 1609.344 / num * 100000;
		
		bw.write(String.format("%.6f", result));
		//bw.write(Double.toString(result));
		
		bw.flush();
	}
}
