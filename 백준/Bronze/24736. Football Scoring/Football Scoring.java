import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			System.out.println(sc.nextInt()*6 + sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt()*1 + sc.nextInt()*2);
		}
	}
}
