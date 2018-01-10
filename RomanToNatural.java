package com.company;
//Input is guaranteed to be within the range from 1 to 3999.
//Given a roman numeral, convert it to an integer.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanToNatural {
    public static int get_roman(char a[]) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'I') {
                n = n + 1;
            } else if (a[i] == 'L') {
                if((i>0) && a[i-1]=='X'){
                    n=n-20;}
                if((i>0) && a[i-1]=='V'){
                    n=n-5;}
                if((i>0) && a[i-1]=='I'){
                    n=n-1;}
                n = n + 50;
            } else if (a[i] == 'X') {
                if ((i>0) && a[i-1]=='I' ) {
                    n=n-2;}
                if ((i>0) && a[i-1]=='V'){
                        n=n-10;}
                n = n + 10;
            }else if (a[i] == 'V') {
                    if ((i>0) && a[i-1]=='I'){
                        n=n-2;}
                n=n+5; }
            else if (a[i]== 'C'){
                if((i>0) && a[i-1]=='X'){
                    n=n-20;}
                if((i>0) && a[i-1]=='V'){
                    n=n-10;}
                if((i>0) && a[i-1]=='I'){
                    n=n-2;}
                if((i>0) && a[i-1]=='L'){
                    n=n-100;}
                n = n + 100;
            }else if (a[i]== 'D'){
                if((i>0) && a[i-1]=='X'){
                    n=n-20;}
                if((i>0) && a[i-1]=='V'){
                    n=n-10;}
                if((i>0) && a[i-1]=='I'){
                    n=n-2;}
                if((i>0) && a[i-1]=='L'){
                    n=n-100;}
                if((i>0) && a[i-1]=='C'){
                    n=n-200;}
                n = n + 500;}
            else if (a[i]== 'M'){
                if((i>0) && a[i-1]=='X'){
                    n=n-20;}
                if((i>0) && a[i-1]=='V'){
                    n=n-5;}
                if((i>0) && a[i-1]=='I'){
                    n=n-2;}
                if((i>0) && a[i-1]=='L'){
                    n=n-100;}
                if((i>0) && a[i-1]=='C'){
                    n=n-200;}
                if((i>0) && a[i-1]=='D'){
                    n=n-1000;}
                n = n + 1000;}
    }return n;}
    public static int duplicate_array(int a[]){
        List<Integer> m = new ArrayList<>();
        for(int i=0;i<a.length;i++){
                if ((i<a.length-1) && a[i]==a[i+1]){
                    continue;
                }
                m.add(a[i]);
    }
    System.out.println(m);
    return m.size();

    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Roman number : ");
        String temp_string = S.next();
        temp_string = temp_string.toUpperCase();
        char [] in_roman = temp_string.toCharArray();
        System.out.println(get_roman(in_roman));
        System.out.println();
        System.out.println();
        System.out.println("Kindly Enter the Array lenght :");
        int m = S.nextInt();
        System.out.println("Lenght:"+m);
        int[] remove_dup = new int[m];
        System.out.println("Kindly Enter the sorted Array elements :");
        for(int i=0;i<m;i++){
            remove_dup [i] = S.nextInt();
        }
        System.out.println(duplicate_array(remove_dup));
    }
}

