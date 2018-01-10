/*
Given a string, S, of length N that is indexed from 0 to N-1,
print its even-indexed and odd-indexed characters as 2 space-separated strings
 on a single line.
 Sample Input :
2
Hacker
Rank

 Sample Output:
Hce akr
Rn ak
 */

package com.company;

import java.io.*;
import java.util.*;

public class EvenOddPrint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of digits :");
        int inNumb = in.nextInt();
        System.out.println("enter the strings");
        List<String> inString = new ArrayList<>();
        for (int i = 0; i <= inNumb; i++) {
            inString.add(i, in.nextLine());
        }
        int oddlenght = 0;
        int evenlenght = 0;
        for (int i = 1; i < inString.size(); i++) {
            if (inString.get(i).length() % 2 == 0) {
                oddlenght = (int) (inString.get(i).length() / 2);
                evenlenght = (int) (inString.get(i).length() / 2);
            } else {
                oddlenght = ((int) (inString.get(i).length() / 2));
                evenlenght = ((int) (inString.get(i).length() / 2)) + 1;
            }
            char[] tempOdd = new char[oddlenght];
            char[] tempEven = new char[evenlenght];
            for (int j = 0, k = 0, m = 0; j < inString.get(i).length(); j++) {

                if (j % 2 == 0) {
                    tempEven[k++] = inString.get(i).charAt(j);
                } else {
                    tempOdd[m++] = inString.get(i).charAt(j);
                }
            }
            String s1 = new String(tempEven);
            String s2 = new String(tempOdd);

            System.out.println(s1 + " " + s2);
        }
    }
}
