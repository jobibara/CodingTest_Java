import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        int num1,num2;
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            
            if(num1 == 0) {
                if(num2 == 0) {
                    break;
                }
            }
            bw.write((num1+num2)+"\n");
        }
        bw.close();
    }
}