package uz.xsoft.february;

import java.util.Arrays;

public class Context_6001 {
    public static long smallestNumber(long num) {
        int size = digitsCount(num), index = 0;
        long[] arr = new long[size];
        boolean bool = num > 0;
        if (!bool) num *= -1;
        while (num > 0) {
            arr[index++] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        long result = 0;
        int nullCount = 0;
        if (bool) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    nullCount++;
                } else {
                    result = result * 10 + arr[i];
                    if (nullCount > 0) {
                        result *= Math.pow(10,nullCount);
                        nullCount =0;
                    }
                }
            }
        } else {
            for (int i = arr.length-1; i >= 0; i--) {
                result = result *10 + arr[i];
            }
            result *= -1;
        }
        return result;
    }

    private static int digitsCount(long num) {
        int result = 0;
        if (num < 0) num *=-1;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(smallestNumber(-5102));
        System.out.println(smallestNumber(-62000152));
    }
}
