import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int antenna = Integer.parseInt(br.readLine());
		int eyes = Integer.parseInt(br.readLine());
		
		if(antenna >=3 && eyes <= 4) {
			bw.write("TroyMartian\n");
		}
		else {}
		
		if(antenna <= 6 && eyes >= 2) {
			bw.write("VladSaturnian\n");
		}
		else {}

		if(antenna <= 2 && eyes <= 3) {
			bw.write("GraemeMercurian\n");
		}
		else {}
		
		bw.flush();
	}
}
