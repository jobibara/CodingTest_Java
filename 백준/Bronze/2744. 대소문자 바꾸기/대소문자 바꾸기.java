import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String ans = "";
        
        for(int i = 0; i<str.length(); i++) {
            char x = str.charAt(i);
            if(Character.isUpperCase(x)) {
                ans = ans + Character.toLowerCase(x);
            }
            else {
                ans = ans + Character.toUpperCase(x);
            }
        }
        System.out.println(ans);
    }
}