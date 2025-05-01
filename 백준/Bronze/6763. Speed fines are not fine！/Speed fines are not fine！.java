import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int limit = Integer.parseInt(br.readLine());
		int speed = Integer.parseInt(br.readLine());
		
		int diff = speed - limit;
		
		if(diff >= 31) {
			bw.write("You are speeding and your fine is $500.");
		}
		else if(diff < 31 && diff >= 21) {
			bw.write("You are speeding and your fine is $270.");
		}
		else if(diff < 21 && diff >= 1) {
			bw.write("You are speeding and your fine is $100.");
		}
		else {
			bw.write("Congratulations, you are within the speed limit!");
		}
		
		bw.flush();
	}
}
