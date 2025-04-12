import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int ans = Integer.parseInt(st.nextToken())*56 + Integer.parseInt(st.nextToken())*24 + Integer.parseInt(st.nextToken())*14+ Integer.parseInt(st.nextToken())*6; 
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
    }
}