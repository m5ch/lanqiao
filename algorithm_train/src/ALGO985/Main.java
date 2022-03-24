package ALGO985;

import java.util.Scanner;

/**
 * @ Classname Main
 * @ Description 幸运的店家(贪心)(仍需努力！！)
 * @ Date 2022/3/24 20:38
 * @ Created by 落尘
 * 参考：https://blog.csdn.net/qq_45031509/article/details/123359858
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n % 3 == 0){
            n /= 3;
        }
        long res = n / 3 + 1;
        System.out.println(res);
    }
}
