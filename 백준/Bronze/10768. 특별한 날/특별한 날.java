import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int mm = Integer.parseInt(br.readLine());
		int dd = Integer.parseInt(br.readLine());
		
		if(mm > 2) {
			bw.write("After");
		}
		else if(mm < 2) {
			bw.write("Before");
		}
		else {
			if(dd > 18) {
				bw.write("After");
			}
			else if(dd < 18) {
				bw.write("Before");
			}
			else {
				bw.write("Special");
			}
		}
		
		bw.flush();
	}
}