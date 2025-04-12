import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		BigInteger b1 = new BigInteger("1");
		BigInteger result =new BigInteger("1");
		
		
		for(int i = 1; i<N+1; i++) {
			BigInteger b2 = new BigInteger(Integer.toString(i));
			result = b1.multiply(b2);
			b1 = result;
			
		}
		
		System.out.println(result);
	}
}
