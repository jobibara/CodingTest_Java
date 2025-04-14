import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.nextInt()*1000 + sc.nextInt()*10000);
		sc.close();
	}
}
