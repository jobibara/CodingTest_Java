import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        while(true) {
            str = str.toLowerCase();
            int count = 0;
            for(int i = 0; i <str.length(); i++) {
                if(isVowel(str.charAt(i))) count++;            
            }
            System.out.println(count);
            str = br.readLine();
            if(str.equals("#")) break;
        }
    }
    public static boolean isVowel(char x) {
        if(x == 'i') {
            return true;
        }
        else if(x == 'a') {
            return true;
        }
        else if(x == 'e') {
            return true;
        }
        else if(x == 'o') {
            return true;
        }
        else if(x == 'u') {
            return true;
        }
        else {
            return false;
        }
    }
}