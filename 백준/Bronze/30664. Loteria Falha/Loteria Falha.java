import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String num = br.readLine();
			
			if(num.equals("0"))
				break;
			
			BigInteger b1 = new BigInteger(num);
			BigInteger temp = new BigInteger("42");
			BigInteger result = b1.mod(temp);
			
			if(result.toString().equals("0")) {
				bw.write("PREMIADO\n");
			}
			else {
				bw.write("TENTE NOVAMENTE\n");
			}
		}
		
		bw.flush();
	}
}
