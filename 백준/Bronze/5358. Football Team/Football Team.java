import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String name = br.readLine();
			if(name == null) {
				break;
			}
			String result = "";
			
			for(int i = 0; i<name.length(); i++) {
				switch(name.charAt(i)) {
				case 'i': result += 'e';
						  break;
				case 'e': result += 'i';
						  break;
				case 'I': result += 'E';
						  break;
				case 'E': result += 'I';
						  break;
				default : result += name.charAt(i);
				}
			}
			
			bw.write(result+"\n");
		}
		bw.flush();
	}
}
