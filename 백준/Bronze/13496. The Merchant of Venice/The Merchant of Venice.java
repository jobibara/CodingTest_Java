import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i<N; i++) {
			bw.write("Data Set "+Integer.toString(i+1)+":\n");
			
			int cnt = 0;
		    st = new StringTokenizer(br.readLine());
		    
		    int n = Integer.parseInt(st.nextToken());
		    int speed = Integer.parseInt(st.nextToken());
		    int last = Integer.parseInt(st.nextToken());
		    
		    int temp = speed * last;
		    
		    for(int j = 0; j<n; j++) {
		    	st = new StringTokenizer(br.readLine());
		    	
		    	int distance = Integer.parseInt(st.nextToken());
		    	int money = Integer.parseInt(st.nextToken());
		    	
		    	if(distance <= temp) {
		    		cnt += money;
		    	}
		    }
		    
		    bw.write(Integer.toString(cnt)+"\n\n");
		}
		bw.flush();
	}
}