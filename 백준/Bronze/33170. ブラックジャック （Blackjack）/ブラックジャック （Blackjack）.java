import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt() + sc.nextInt() + sc.nextInt();
		
		if(num <= 21) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		sc.close();
	}
}