import java.util.*;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int drink = sc.nextInt();
		
		if(drink == 0) {
			if(time >=0 && time <= 11) {
				System.out.println(280);
			}
			else if(time >= 12 && time <= 16) {
				System.out.println(320);
			}
			
			else {
				System.out.println(280);
			}
		}
		
		else if(drink == 1) {
			System.out.println(280);
		}
			
	}
}