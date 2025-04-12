import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger big1 = new BigInteger(br.readLine());
        BigInteger big2 = new BigInteger(br.readLine());
        
        System.out.println(big1.multiply(big2));
        
    }
}