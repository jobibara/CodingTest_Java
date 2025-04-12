import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals("0"))
				break;
			
			System.out.println("Case "+cnt+": Sorting... done!");
			cnt++;
		}
	}
}
