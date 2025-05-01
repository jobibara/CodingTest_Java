import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] depth = new int[4];
		for(int i = 0; i<4; i++) {
			depth[i] = Integer.parseInt(br.readLine());
		}
		
		if(depth[0] - depth[1] > 0) {
			for(int i = 1; i<3; i++) {
				if(depth[i] - depth[i+1] <= 0) {
					bw.write("No Fish");
					break;
				}
				else {
					if(i == 2) {
						bw.write("Fish Diving");
					}
				}
			}
		}
		else if(depth[0] - depth[1] < 0) {
			for(int i = 1; i<3; i++) {
				if(depth[i] - depth[i+1] >= 0) {
					bw.write("No Fish");
					break;
				}
				else {
					if(i == 2) {
						bw.write("Fish Rising");
					}
				}
			}
		}
		else {
			for(int i = 1; i<3; i++) {
				if(depth[i] != depth[i+1]) {
					bw.write("No Fish");
					break;
				}
				else {
					if(i == 2) {
						bw.write("Fish At Constant Depth");
					}
				}
			}
		}
		
		bw.flush();
	}
}
