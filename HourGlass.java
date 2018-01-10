/*
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
Sample Input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output:
19
 */

package com.company;

import java.io.*;
import java.util.*;

public class HourGlass {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[][] inArr = new int[6][6];
        System.out.println("Kindly enter the Array elements");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                inArr[i][j] = S.nextInt();

            }
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = inArr[i][j] + inArr[i][j + 1] + inArr[i][j + 2] + inArr[i + 1][j + 1] + inArr[i + 2][j] + inArr[i + 2][j + 1] + inArr[i + 2][j + 2];
                //Just to check which elements are been selected in each round
//                System.out.println(inArr[i][j]+" "+inArr[i    ][j + 1]+" "+inArr[i    ][j + 2]);
//                System.out.println("  "+inArr[i+1][j + 1]+"  ");
//                System.out.println(inArr[i+2][j]+" "+inArr[i    ][j + 1]+" "+inArr[i  +2  ][j + 2]);
//                System.out.println();
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("The maximun sum value :" + max);
    }
}