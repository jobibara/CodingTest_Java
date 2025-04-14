import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N <= 780 && N >= 620) {
			bw.write("Red");
		}
		else if(N < 620 && N >= 590) {
			bw.write("Orange");
		}
		else if(N < 590 && N >= 570) {
			bw.write("Yellow");
		}
		else if(N < 570 && N >= 495) {
			bw.write("Green");
		}
		else if(N < 495 && N >= 450) {
			bw.write("Blue");
		}
		else if(N < 450 && N >= 425) {
			bw.write("Indigo");
		}
		else {
			bw.write("Violet");
		}
		
		bw.flush();
	}
}
