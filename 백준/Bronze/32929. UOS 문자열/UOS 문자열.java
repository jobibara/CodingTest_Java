
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num%3) {
		case 1: bw.write("U");
		break;
		
		case 2: bw.write("O");
		break;
		
		case 0: bw.write("S");
		break;
		}
		
		bw.flush();
		bw.close();
	}
}
