import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st_1;
        StringTokenizer st_2;
        st_1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_1.nextToken());
        int x = Integer.parseInt(st_1.nextToken());
        st_2 = new StringTokenizer(br.readLine());
        
        for(int i =0; i< N;i++) {
            int num = Integer.parseInt(st_2.nextToken());
            if(x > num) {
                bw.write(num+" ");
            }
        }
        
        bw.close();
        
                        
    }
}