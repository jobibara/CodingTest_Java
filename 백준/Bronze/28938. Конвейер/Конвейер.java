import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			int temp = sc.nextInt();
			
			if(temp == 1) {
				cnt++;
			}
			else if(temp == -1) {
				cnt--;
			}
			else {
				continue;
			}
		}
		
		if(cnt > 0) {
			System.out.println("Right");
		}
		else if(cnt < 0) {
			System.out.println("Left");
		}
		else {
			System.out.println("Stay");
		}
	}
}
