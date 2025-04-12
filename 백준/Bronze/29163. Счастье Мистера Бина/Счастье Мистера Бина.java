import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			int temp = sc.nextInt();
			
			if(temp%2 == 0) {
				cnt++;
			}
			else {
				cnt--;
			}
		}
		
		if(cnt > 0) {
			System.out.println("Happy");
		}
		else {
			System.out.println("Sad");
		}
		
	}
}
