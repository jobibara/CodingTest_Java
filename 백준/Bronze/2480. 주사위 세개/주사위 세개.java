import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        
        int money = 0;
        int max = 0;
        
        if(first > second){
            if(first > third) {
                max = first;
            }
            else if(first < third) {
                max = third;
            } 
        }
        else if(first < second) {
            if(second > third) {
                max = second;
            }
            else if(second < third) {
                max = third;
            }
        }
        
        if(first == second) {
            if(first == third) {
                money = 10000 + first*1000;
            }
            else {
                money = 1000 + first*100;
            }
        }
        else if(first == third) {
            money = 1000 +first*100;
        }
        else if(second == third) {
            money = 1000 +second*100;
        }
        else {
            money = max*100;
        }
        
        System.out.println(money);
    }
}