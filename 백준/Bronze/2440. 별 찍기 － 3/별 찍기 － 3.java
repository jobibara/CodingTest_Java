import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        for(int i = N; i >0; i--) {
            for(int j = i; j > 0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}