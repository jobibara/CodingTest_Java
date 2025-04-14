import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() * 7;
		
		int year = 2024 + n / 12 ;
		int month = 1 + n;
		
		if(month%12 == 0) {
			month = 12;
		}
		else {
			month = month%12;
		}
		
		System.out.println(year +" " + month);
		
		sc.close();
	}
}