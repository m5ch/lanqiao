package Triangle;

import java.util.Scanner;

/**
 * @ Classname Test
 * @ Description triangle area
 * @ Date 2022/3/23 12:50
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a ,h, s;
        a = sc.nextInt();
        h = sc.nextInt();
            s = a * h /2;
        if (a % 2 == 0 || h % 2 == 0){
//            System.out.println(String.format("%,.0f",s));
            System.out.println((int)s);
        }
        else{
//            s = a * h /2;
            System.out.println(String.format("%.1f",s));
        }
    }
}
