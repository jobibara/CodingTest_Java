import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int X = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int priceX = 0;
		int priceY = 0;
		
		int amountX = 0;
		int amountY = 0;
		
		while(true) {
			if(amountX >= N) {
				break;
			}
			amountX += X;
			priceX += A;
		}
		
		while(true) {
			if(amountY >= N) {
				break;
			}
			amountY += Y;
			priceY += B;
		}
		
		if(priceX <= priceY) {
			bw.write(Integer.toString(priceX));
		}
		else if(priceX > priceY) {
			bw.write(Integer.toString(priceY));
		}
		
		bw.flush();
	}
}