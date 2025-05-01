import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long row = Long.parseLong(st.nextToken());
		Long col = Long.parseLong(st.nextToken());
		
		if(row > col) {
			if(row%2 == 0) {
				bw.write("0");
			}
			else {
				if(col%2 == 0) {
					bw.write("0");
				}
				else {
					bw.write(Long.toString(col));
				}
			}
		}
		else if(row == col) {
			if(row%2 == 0) {
				bw.write("0");
			}
			else {
				bw.write(Long.toString(col));
			}
		}
		else {
			if(col%2 == 0) {
				bw.write("0");
			}
			else {
				if(row%2 == 0) {
					bw.write("0");
				}
				else {
					bw.write(Long.toString(row));
				}
			}
		}
		bw.flush();
		
	}
}
