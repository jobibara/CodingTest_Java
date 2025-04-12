import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int distance = sc.nextInt();
        
        if(distance%5 == 0) {
            System.out.println(distance/5);
        }
        else {
            System.out.println(distance/5+1);
        }
    }
}