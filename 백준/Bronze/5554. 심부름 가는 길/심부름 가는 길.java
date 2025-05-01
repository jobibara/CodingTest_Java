import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        
        for(int i = 0; i<4; i++) {
            int second = Integer.parseInt(br.readLine());
            sum += second;
        }
        
        int ans_min = sum / 60;
        int ans_sec = sum % 60;
        
        System.out.println(ans_min);
        System.out.println(ans_sec);
    }
}