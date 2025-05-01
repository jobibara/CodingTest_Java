import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String temp = br.readLine();
			
			switch(temp) {
				case "CU" : bw.write("see you\n");
							break;
				case ":-)": bw.write("I’m happy\n");
							break;
				case ":-(": bw.write("I’m unhappy\n");
							break;
				case ";-)": bw.write("wink\n");
							break;
				case ":-P": bw.write("stick out my tongue\n");
							break;
				case "(~.~)": bw.write("sleepy\n");
							break;
				case "TA": bw.write("totally awesome\n");
							break;
				case "CCC": bw.write("Canadian Computing Competition\n");
							break;
				case "CUZ": bw.write("	because\n");
							break;
				case "TY": bw.write("thank-you\n");
							break;
				case "YW": bw.write("you’re welcome\n");
							break;
				case "TTYL": bw.write("talk to you later\n");
							break;
				default: bw.write(temp+"\n");
							  break;
			}
			
			if(temp.equals("TTYL")) {
				break;
			}
		}
		
		bw.flush();
	}
}
