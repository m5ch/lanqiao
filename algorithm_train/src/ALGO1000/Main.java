package ALGO1000;

import java.util.Scanner;

/**
 * @ Classname Main
 * @ Description kAc给糖果你吃(已解决)
 * @ Date 2022/3/23 18:55
 * @ Created by 落尘
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] A = new long[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        //确定增长量h的值
        int h = 1;
        while(h <= n/2){
            h = 2 * h + 1;
        }
        //排序
        while(h >= 1){
            for (int i = 0; i < n; i++) {
                for (int j = i; j >= h ; j -= h) {
                    if (large(A[j - h],A[j])){
                        exch(A,j,j-h);
                    }
                }
            }
            h /= 2;
        }
        long sum = 0;
        for (int i = 0; i < m; i++) {
//            System.out.println(A[i]);
            sum += A[i];
        }
        System.out.println(sum);
    }

    private static boolean large( Comparable x,Comparable y){
        return x.compareTo(y) < 0;
    }

    private static void exch(long[] a,int x,int y){
        long temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
