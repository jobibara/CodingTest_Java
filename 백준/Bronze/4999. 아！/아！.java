import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String can = br.readLine();
        String want = br.readLine();
        
        if(can.length() >= want.length()) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}