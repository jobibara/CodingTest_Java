import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Ascci = new int[26];
        for(int i = 0; i<26; i++) {
            Ascci[i] = 0;
        }
        
        String str = br.readLine();
        for(int i = 0; i<str.length(); i++) {
            char Alphabet = str.charAt(i);
            int num = (int)Alphabet;
            Ascci[num-97]++;
        }
        for(int i = 0; i<26; i++) {
            System.out.print(Ascci[i] + " ");
        }
    }
}