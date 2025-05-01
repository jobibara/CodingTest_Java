import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int people = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<5; i++) {
            int news = Integer.parseInt(st.nextToken());
            System.out.print((news-people) + " ");
        }
    }
}