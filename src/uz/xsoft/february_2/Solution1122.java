package uz.xsoft.february_2;

import java.util.Arrays;

public class Solution1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // 2,2,1,4,3,4,6,7,9,3,19,56,98]    [2,1,4,3,9,6]
        /*
        [2,2,1,3,3,4,6,7,9,2,19]
        [2,2,2,3,3,4,6,7,9,1,19]
        [2,2,2,1,3,4,6,7,9,3,19]

        int index =
        for(int i =index; i< leng; i++) {
            for(int j =i+1; j< leng; j++) {

            }
        }
        */

        int t;
        int in = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]){
                    t =  arr1[in];
                    arr1[in++] = arr1[j];
                    arr1[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = in; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length ; j++) {
               if (arr1[i] > arr1[j]){
                  t = arr1[j];
                  arr1[j] = arr1[i];
                  arr1[i] = t;
               }
            }
        }
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }
}
