import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<8; i++) {
			int n = sc.nextInt();
			
			if(n == 1 || n == 0) {
				if(i == 7) {
					System.out.println("S");
				}
			}
			else {
				System.out.println("F");
				break;
			}
			
			
		}
		
	}
}
