import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger big1 = new BigInteger(st.nextToken());
        BigInteger big2 = new BigInteger(st.nextToken());
        BigInteger big3 = new BigInteger(st.nextToken());
        
        System.out.println(big1.add(big2.add(big3)));
    }
}