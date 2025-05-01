import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int dayOfVac = Integer.parseInt(br.readLine());
        int pageOfKor = Integer.parseInt(br.readLine());
        int pageOfMath = Integer.parseInt(br.readLine());
        int solvePageKor = Integer.parseInt(br.readLine());
        int solvePageMath = Integer.parseInt(br.readLine());
        
        int cntKor = 0;
        int cntMath = 0;
        
        if(pageOfKor % solvePageKor == 0) {
            cntKor = pageOfKor / solvePageKor;
        }
        else {
            cntKor = (pageOfKor / solvePageKor) + 1;
        }
        if(pageOfMath % solvePageMath == 0) {
            cntMath = pageOfMath / solvePageMath;
        }
        else {
            cntMath = (pageOfMath / solvePageMath) + 1;
        }
        
        if(cntKor >= cntMath) {
            System.out.println(dayOfVac - cntKor);
        }
        else {
            System.out.println(dayOfVac - cntMath);
        }
        
    }
}