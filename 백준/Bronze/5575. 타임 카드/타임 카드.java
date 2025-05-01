import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		for(int i = 0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int[] time_start = new int[3];
			int[] time_end = new int[3];
			int[] result = new int[3];
			
			for(int j = 0; j<3;  j++) {
				time_start[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j<3; j++) {
				time_end[j] = Integer.parseInt(st.nextToken());
			}
			
			if(time_start[2] <= time_end[2]) {
				result[2] = time_end[2] - time_start[2];
				if(time_start[1] <= time_end[1]) {
					result[1] = time_end[1] - time_start[1];
				}
				else {
					time_end[0]--;
					time_end[1] += 60;
					result[1] = time_end[1] - time_start[1];
				}
			}
			
			else {
				time_end[1]--;
				time_end[2] += 60;
				result[2] = time_end[2] - time_start[2];
				if(time_start[1] <= time_end[1]) {
					result[1] = time_end[1] - time_start[1];
				}
				else {
					time_end[0]--;
					time_end[1] += 60;
					result[1] = time_end[1] - time_start[1];
				}
			}
			
			result[0] = time_end[0] - time_start[0];
			bw.write(Integer.toString(result[0])+" "+Integer.toString(result[1])+" "+Integer.toString(result[2]));
			bw.write("\n");
		}
		bw.flush();
	}
}
