/* Given two arrays, find whether the given arrays are same.
 * Considering the condition as, if the number of are elements are different it won't match
  * Sample Input :
  * Elements of first Array : 1, 2, 3, 4, 2, 3, 5, 6, 8, 3
  * Elements of first Array : 3, 5, 2, 2, 8, 1, 3, 6, 4, 3
  *
  *Output :
  * "Both the Arrays match"
  * */

import java.util.*;

public class ArrayMatching {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 3, 5, 6, 8, 3}; // Enter your first array elements  here
        int[] arr2 = {3, 5, 2, 2, 8, 1, 3, 6, 4, 3}; // Enter your first array elements  here
        int count = 0;
        List<Integer> arr_list2 = new ArrayList<Integer>();
        try {
            if (arr1.length != arr2.length) {
                System.out.println("Arrays cant be matched at all");
            } else {
                for (int i = 0; i < arr1.length; i++) {

                    for (int j = 0; j < arr2.length; j++) {
                        if (arr1[i] == arr2[j]) {
                            arr_list2.add(i, arr2[j]);
                            arr2[j] = -99999;
                            count++;
                            break;
                        }
                    }
                }
            }
            List<Integer> arr_list1 = new ArrayList<Integer>();
            for (int i : arr1)
                arr_list1.add(i);

            if (count == arr_list1.size()) {
                System.out.println("Both the Arrays match");
//         Printing the Arrays if they match.
//                System.out.println(arr_list1);
//                System.out.println(arr_list2);
            }
        } catch (Exception e) {
            System.out.println("Arrays doesn't match");
        }
    }
}
