import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max;
		int mel;
		
		max = sc.nextInt()*3 + sc.nextInt()*20 + sc.nextInt()*120;
		mel = sc.nextInt()*3 + sc.nextInt()*20 + sc.nextInt()*120;
		
		if(max > mel) {
			System.out.println("Max");
		}
		else if(max < mel) {
			System.out.println("Mel");
		}
		else {
			System.out.println("Draw");
		}
	}
}
