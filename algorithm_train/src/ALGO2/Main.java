package ALGO2;

import java.util.Scanner;

/**
 * @ Classname Main
 * @ Description 最大最小公倍数(贪心)
 * @ Date 2022/3/23 15:35
 * @ Created by 落尘
 * 参考网址：https://blog.csdn.net/qq_36403227/article/details/88677874
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextInt();
        if (n % 2 != 0){
            System.out.println(n * (n-1) * (n-2));
        }
        else{
            if (n % 3 != 0)
                System.out.println(n * (n-1)* (n-3));
            else
                System.out.println((n-1)*(n-2)*(n-3));
        }
    }
}