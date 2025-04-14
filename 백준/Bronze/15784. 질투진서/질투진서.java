import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		
		int jinseo = 0;
		int max = -1;
		
		for(int i = 1; i<= N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 1; j<=N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if(row == i) {
					if(col == j) {
						jinseo = temp;
					}
					
					else {
						if(temp > max) max = temp;
					}
				}
				
				else {
					if(col == j) {
						if(temp > max) max = temp;
					}
					
					else if(col < j) {
						break;
					}
				}
			}
			
		}
		if(max <= jinseo) {
			System.out.println("HAPPY");
		}
		
		else {
			System.out.println("ANGRY");
		}
		
		br.close();
		
	}
}
