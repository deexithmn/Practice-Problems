/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

        We define the rating for Alice's challenge to be the triplet A = (a0 a1, a2), and the rating for Bob's challenge to be the triplet B = (b0, b1, b3).

        Your task is to find their comparison points by comparing  with ,  with , and  with .

        If , ai > bi, then Alice is awarded  point.
        If , ai < bi,then Bob is awarded  point.
        If , ai = bi,then neither person receives a point.
        Comparison points is the total points a person earned.

        Given A and B, can you compare the two challenges and print their respective comparison points?*/

package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int [] res = new int[2];
        if(a0>b0){
            res[0]++;}
        else if(a0<b0){
            res[1]++;
        }
        if(a1>b1){
            res[0]++;}
        else if(a1<b1){
            res[1]++;
        }
        if(a2>b2){
            res[0]++;}
        else if(a2<b2){
            res[1]++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}

