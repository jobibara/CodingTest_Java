import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		try {
			while(true) {
				String str = sc.nextLine();
				
				if(str.equals(""))
					break;
				
				cnt++;
			}
			
			System.out.println(cnt);
		}
		catch(NoSuchElementException e) {
			System.out.println(cnt);
		}
		
	}
}
