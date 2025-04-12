import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] chess = new int[6];
        chess[0] = 1;
        chess[1] = 1;
        chess[2] = 2;
        chess[3] = 2;
        chess[4] = 2;
        chess[5] = 8;
        
        
        for(int i = 0; i<6; i++) {
            int amount = Integer.parseInt(st.nextToken());
            chess[i] -= amount;
            System.out.print(chess[i] + " ");
        }
        
        
        
        
    }
}