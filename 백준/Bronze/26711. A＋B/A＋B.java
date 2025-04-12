import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger b1 = new BigInteger(sc.next());
		BigInteger b2 = new BigInteger(sc.next());
		
		System.out.println(b1.add(b2));
	}
}