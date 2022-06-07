package uz.xsoft.january;

import java.util.Collections;

public class Solution1399 {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(1,2);
//        map.forEach((key, value) -> {
//            System.out.println(key + " ->" + value);
//        });
        System.out.println(countLargestGroup(2));
    }

    public static int countLargestGroup(int n) {
        int[] arr = new int[37];
        for (int i = 1; i <= n; i++) {
            arr[getSumOfDigits(i)] += 1;
        }
        int max = 0;
        int count = 1;
        for (int i = 0; i < 37; i++) {
            System.out.print(arr[i] +", ");
            if (max == arr[i]) count++;
            if (max < arr[i]) {
                count = 1;
                max = arr[i];
            }
        }
        System.out.println();
        return count;
    }

    private static int getSumOfDigits(int n) {
        return n == 0 ? 0 : n %10 + getSumOfDigits(n /10);
    }
}
