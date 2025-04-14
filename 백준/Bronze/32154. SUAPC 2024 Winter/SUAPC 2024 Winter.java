import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		switch(N) {
		case 1 : bw.write("11\nA B C D E F G H J L M");
				 break;
		case 2 : bw.write("9\nA C E F G H I L M");
				 break;
		case 3 : bw.write("9\nA C E F G H I L M");
				 break;
		case 4 : bw.write("9\nA B C E F G H L M");
				 break;
		case 5 : bw.write("8\nA C E F G H L M");
				 break;
		case 6 : bw.write("8\nA C E F G H L M");
				 break;
		case 7 : bw.write("8\nA C E F G H L M");
				 break;
		case 8 : bw.write("8\nA C E F G H L M");
				 break;
		case 9 : bw.write("8\nA C E F G H L M");
				 break;
		case 10: bw.write("8\nA B C F G H L M");
				 break;
		}
		
		bw.flush();
	}
}