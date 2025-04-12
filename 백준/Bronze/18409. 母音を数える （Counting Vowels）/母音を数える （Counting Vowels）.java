import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		
		for(int i = 0; i < length; i++) {
			char temp = str.charAt(i);
			
			switch(temp) {
				case 'i': cnt++;
						  break;
				case 'o' : cnt++;
						   break;
				case 'a' : cnt++;
						   break;
				case 'e' : cnt++;
						   break;
				case 'u' : cnt++;
						   break;
				default : continue;
			}
		}
		System.out.println(cnt);
	}
}
