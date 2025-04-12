import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int money = Integer.parseInt(br.readLine());
        
        int firstCase = money * 78 / 100;
        int secondCase = (money * 80 / 100) + (money * 20 / 100 * 78 / 100);
        
        bw.write(Integer.toString(firstCase));
        bw.write("\n");
        bw.write(Integer.toString(secondCase));
        bw.flush();
        bw.close();
    }
}