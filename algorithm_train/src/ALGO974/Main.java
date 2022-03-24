package ALGO974;

import java.util.Scanner;

/**
 * @ Classname Main
 * @ Description P0801(解决)
 * @ Date 2022/3/23 20:42
 * @ Created by 落尘
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        Add(n,a1,a2,result);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static void Add(int n, int[] a1, int[] a2, int[] result){

        for (int i = 0; i < n; i++) {
            result[i] = a1[i] + a2[i];
        }

    }
}
