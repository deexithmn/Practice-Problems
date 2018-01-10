package com.company;
/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You may assume no duplicates in the array.

        Here are few examples.
        [1,3,5,6], 5 → 2
        [1,3,5,6], 2 → 1
        [1,3,5,6], 7 → 4
        [1,3,5,6], 0 → 0*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPlace {
    public static int positioning(List<Integer> a, int N) {
        int flag = 0;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (N == a.get(i)) {
                return flag = i;
            }
        }
        if (a.get(0) > N) {
            return 0;
        } else if (N > a.get(size - 1)) {
            return flag = a.size();
        }

        for (int i = 0; i < size; i++) {
            if (a.get(i) > N) {
                return flag = i;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Kindly enter the sorted array");
        String inputString = S.nextLine();
        String inputStringArray[] = {};
        int N = 0;
        inputStringArray = inputString.split(" ");
        List<Integer> in = new ArrayList<Integer>();
        for (int i = 0; i < inputStringArray.length; i++) {
            in.add(Integer.parseInt(inputStringArray[i]));
        }
        System.out.println("Enter the target value : ");
        N = S.nextInt();
        System.out.println("Required Position :" + positioning(in, N));
    }
}
