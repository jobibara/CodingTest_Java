import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] chr = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			chr[i] = str.charAt(i);
		}
		
		String result = "";
		
		for(int i = str.length()-1; i>-1; i--) {
			result = result + chr[i];
		}
		
		System.out.println(result);
	}
}
