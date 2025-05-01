import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Character str = br.readLine().charAt(0);
		
		bw.write(Integer.toString((int)str - 44031));
		bw.flush();
	}
}
