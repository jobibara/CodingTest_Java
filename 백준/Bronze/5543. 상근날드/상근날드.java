import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger_min = 2000;
        int drink_min = 2000;
        
        for(int i = 0; i<3; i++) {
            int burger = Integer.parseInt(br.readLine());
            if(burger < burger_min) {
                burger_min = burger;
            }
        }
        for(int i = 0; i<2; i++) {
            int drink = Integer.parseInt(br.readLine());
            if(drink < drink_min) {
                drink_min = drink;
            }
        }
        System.out.println(burger_min + drink_min - 50);
    }
}