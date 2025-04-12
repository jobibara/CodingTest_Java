import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger big_1 = new BigInteger(br.readLine());
        BigInteger big_2 = new BigInteger(br.readLine());
        
        System.out.println(big_1.add(big_2));
        System.out.println(big_1.subtract(big_2));
        System.out.println(big_1.multiply(big_2));
        
    }
}