//A＠B = (A+B)×(A-B)

import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger big1 = new BigInteger(st.nextToken());
        BigInteger big2 = new BigInteger(st.nextToken());
        
        BigInteger big3 = big1.add(big2);
        BigInteger big4 = big1.subtract(big2);
        BigInteger big5 = big3.multiply(big4);
        
        
        bw.write(big5.toString());
        bw.flush();
        bw.close();
    }
}