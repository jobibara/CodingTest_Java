import java.io.*;
import java.util.*;
import java.text.*;

public class Main{
    public static void main(String[] args) {
        Date date_now = new Date(System.currentTimeMillis());
        SimpleDateFormat eight_format = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println(eight_format.format(date_now));
    }
}