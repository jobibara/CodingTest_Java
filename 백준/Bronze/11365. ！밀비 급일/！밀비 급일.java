import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        
        sb = new StringBuilder(br.readLine());
        while(true) {
            String ReverseStr = sb.reverse().toString();
            System.out.println(ReverseStr);
            sb = new StringBuilder(br.readLine());
            if(sb.toString().equals("END")) {
                break;
            }
        }
    }
}