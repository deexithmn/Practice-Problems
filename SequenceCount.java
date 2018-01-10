/* Count the characters repeated in a given string*/

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceCount {
    public static void counter(String inStr) {
        char[] inChar = inStr.toCharArray();
        List<Character> checkChar = new ArrayList<Character>();
        List<Integer> count = new ArrayList<Integer>();
        int m = 1;
        for (int i = 0; i < inChar.length; i++) {
            if (i < inChar.length - 1 && inChar[i] == inChar[i + 1]) {
                ++m;
            } else {
                checkChar.add(inChar[i]);
                count.add(m);
                m = 1;
            }
        }
        for (int i = 0; i < checkChar.size(); i++) {
            System.out.println(checkChar.get(i) + "->" + count.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Kindly enter the no. of  sequences");
        String inString = new String();
        inString = S.next();
        counter(inString);
    }
}