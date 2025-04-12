import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int man = Integer.parseInt(st.nextToken());
        int woman = Integer.parseInt(st.nextToken());
        
        while(man != 0 || woman != 0) {
            System.out.println(man+woman);
            st = new StringTokenizer(br.readLine());
            man = Integer.parseInt(st.nextToken());
            woman = Integer.parseInt(st.nextToken());
        }
        
    }
}