package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Classname test
 * @ Description Anagrams问题
 * @ Date 2022/3/23 11:51
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toLowerCase().toCharArray();
        char[] s2 = sc.next().toLowerCase().toCharArray();
        if (s1.length != s2.length)
            System.out.println('N');
        else{
            Arrays.sort(s1);
            Arrays.sort(s2);
            if (Arrays.equals(s1, s2))
                System.out.println('Y');
            else
                System.out.println('N');
        }
    }
}
