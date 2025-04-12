import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger b1 = new BigInteger(sc.next());
		BigInteger b2 = new BigInteger(sc.next());
		BigInteger b3 = new BigInteger("2");
		
		System.out.println((b1.add(b2).divide(b3)));
		System.out.println(b1.subtract(b2).divide(b3));
	}
}