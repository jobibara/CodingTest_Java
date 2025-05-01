import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        
        for(int i =0;i<2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<4; j++) {
                arr[i] += Integer.parseInt(st.nextToken());
            }
        }
        if(arr[0] >= arr[1]) {
            bw.write(Integer.toString(arr[0]));
        }
        else if(arr[0] < arr[1]) {
            bw.write(Integer.toString(arr[1]));
        }
        bw.flush();
        bw.close();
    }
}