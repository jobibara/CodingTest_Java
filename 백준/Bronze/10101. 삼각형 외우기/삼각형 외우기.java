import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		if(A + B + C == 180) {
			if(A == B) {
				if(B == C) {
					bw.write("Equilateral");
				}
				else {
					bw.write("Isosceles");
				}
			}
			else if(B == C) {
				if(A == B) {
					bw.write("Equilateral");
				}
				else {
					bw.write("Isosceles");
				}
			}
			
			else if(A == C) {
				if(C == B) {
					bw.write("Equilateral");
				}
				else {
					bw.write("Isosceles");
				}
			}
			else {
				bw.write("Scalene");
			}
			
			
		}
		else {
			bw.write("Error");
		}
		
		bw.flush();
	}
}
