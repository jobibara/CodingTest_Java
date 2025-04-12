import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        
        String num = br.readLine();
        long remainNum = 0;
        for(int i =0; i < num.length(); i++){
            remainNum = (remainNum * 10 + (num.charAt(i) - '0')) % 20000303;
        }
        bw.write(remainNum + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}