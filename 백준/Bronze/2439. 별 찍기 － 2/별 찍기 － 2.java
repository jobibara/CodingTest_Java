import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i =0; i<T; i++) {
            for(int k = 1; k < T-i;k++) {
                bw.write(" ");
            }
            
            for(int j = -1; j<i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    } 
}