import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int price = sc.nextInt();
        int amount = sc.nextInt();
        int money = sc.nextInt();
        
        int need_money = (price*amount) - money;
        
        if(need_money <= 0) {
            System.out.println(0);
        } 
        else {
            System.out.println(need_money);
        }
    }
}
