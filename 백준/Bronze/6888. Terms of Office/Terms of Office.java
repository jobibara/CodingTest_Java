import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		bw.write("All positions change in year "+Integer.toString(x)+"\n");
		
		int temp = x;
		
		while(true) {
			temp += 60;
			
			if(temp > y) {
				break;
			}
			
			bw.write("All positions change in year "+Integer.toString(temp)+"\n");
		}
		
		bw.flush();
	}
}
