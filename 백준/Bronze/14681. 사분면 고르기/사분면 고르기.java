import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int num = 0;
        
        if(x > 0) {
            if(y > 0) {
                num = 1;
            }
            else if(y < 0){
                num = 4;
            }
        }
        else if(x < 0) {
            if(y > 0) {
                num = 2;
            }
            else if(y < 0) {
                num = 3;
            }
        }
        
        System.out.println(num);
    }
}