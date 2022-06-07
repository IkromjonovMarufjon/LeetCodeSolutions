package uz.xsoft.february;

import java.util.Arrays;

public class Context_1 {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int pos = 0;
        while (num > 0) {
            digits[pos ++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        return (digits[0] + digits[1])* 10 + digits[2] + digits[3];
    }
}
