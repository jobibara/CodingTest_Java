import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String str = "WelcomeToSMUPC";
		int cnt = 0;
		
		
		System.out.println(str.charAt((N-1)%14));
	}
}
