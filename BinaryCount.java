package com.company;

import java.util.Scanner;

import static java.lang.Math.abs;

public class BinaryCount {

/*Given a base-10 integer, n, convert it to binary (base-2).
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inNum = new Scanner(System.in);
        int num = inNum.nextInt();
        String s = Integer.toBinaryString(num);
        String[] sin = s.split("0");
        int temp = 0;
        for (int i = 0; i < sin.length; i++) {
            if (sin[i].length() > temp) {
                temp = sin[i].length();
            }
        }
        System.out.println(temp);
    }
}