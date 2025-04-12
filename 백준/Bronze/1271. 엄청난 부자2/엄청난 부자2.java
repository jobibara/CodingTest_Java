import java.io.*;
import java.util.*;
import java.math.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger money = new BigInteger(st.nextToken());
        BigInteger people = new BigInteger(st.nextToken());
        
        System.out.println(money.divide(people));
        
        System.out.println(money.remainder(people));
       
    }
}