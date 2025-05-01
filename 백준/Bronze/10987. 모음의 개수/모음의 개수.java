import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        
        for(int i = 0; i<str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a': cnt++;
                          break;
                case 'e': cnt++;
                          break;
                case 'i': cnt++;
                          break;
                case 'o': cnt++;
                          break;
                case 'u': cnt++;
                          break;    
            }
        }
        System.out.println(cnt);
    }
}