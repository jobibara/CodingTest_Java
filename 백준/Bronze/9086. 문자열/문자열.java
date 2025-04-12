import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Character> list;
        
        for(int i = 0; i<testCase; i++) {
            String str = br.readLine();
            
            list = new ArrayList<Character>();
            for(int j = 0; j<str.length(); j++) {
                list.add(str.charAt(j));
            }
            String ans = "";
            ans += Character.toString(list.get(0)) + Character.toString(list.get(list.size()-1));
            System.out.println(ans);
            
        }
    }
}