package uz.xsoft.january;

import java.util.LinkedList;

public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.poll();
        int countZero = 0;
        for (int k : arr) {
            if (k == 0) countZero++;
        }
        int len = arr.length + countZero;
        for (int i = len - 1, j = arr.length - 1; i > j; i--, j--) {
            if (arr[j] != 0) {
                if (i < arr.length) {
                    arr[i] = arr[j];
                }
            } else {
                if (i < arr.length) arr[i] = arr[j];
                i--;
                if (i < arr.length) arr[i] = arr[j];
            }
        }
    }
}
