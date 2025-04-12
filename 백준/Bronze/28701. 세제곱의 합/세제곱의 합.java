import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int add = 0;
		int triple = 0;
		
		for(int i = 1; i<N+1; i++) {
			add += i;
			triple += i*i*i;
		}
		System.out.println(add);
		System.out.println(add*add);
		System.out.println(triple);
		
		
	}
}
