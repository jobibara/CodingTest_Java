import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long row = Long.parseLong(st.nextToken());
		Long col = Long.parseLong(st.nextToken());
		Long range = Long.parseLong(st.nextToken());
		
		Long row1;
		Long col1;
		
		if(row%range != 0) {
			row1 = row/range + 1;
		}
		else {
			row1 = row/range;
		}
		
		if(col%range != 0) {
			col1 = col/range +1;
		}
		else {
			col1 = col/range;
		}
		
		
		bw.write(Long.toString(col1*row1));
		bw.flush();
	}
}
