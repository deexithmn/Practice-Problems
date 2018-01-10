/*  Given an array of  integers and a number, , perform  left rotations on the array.
 *  Then print the updated array as a single line of space-separated integers.

    Sample Input :
        Enter the number of Array elements
         --> 5
        Enter the no. of rotation required
         --> 1
        Enter in the array elements :
         --> 1 2 3 4 5
     Output :
        Result after the rotation :
         --> 2 3 4 5 1
 */


import java.util.*;


public class ArrayRotation {

    static int[] leftRotation(int[] a, int d) {
        int temp = 0;
        int i = 0;
        int n = a.length;
        while (d > 0) {
            temp = a[i];
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            d--;
            a[n - 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Array elements");
        int n = in.nextInt();
        System.out.println("Enter the no. of rotation required");
        int d = in.nextInt();
        System.out.println("Enter in the array elements :");
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        System.out.println("Result after the rotation :");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
    }
}