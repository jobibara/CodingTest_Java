import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = 1;
		int second = 1;
		
		for(int i = 0; i<2; i++) {
			first *= sc.nextInt();
		}
		
		for(int i = 0; i<3; i++) {
			second *= sc.nextInt();
		}
		
		System.out.println(first-second);
	}
}
