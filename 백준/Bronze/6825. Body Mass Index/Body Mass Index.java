import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Double weight = Double.parseDouble(br.readLine());
		Double height = Double.parseDouble(br.readLine());
		
		Double BMI = weight/(height*height);
		
		if(BMI > 25) {
			bw.write("Overweight");
		}
		else if(BMI <= 25 && BMI >= 18.5) {
			bw.write("Normal weight");
		}
		else {
			bw.write("Underweight");
		}
		
		bw.flush();
	}
}
