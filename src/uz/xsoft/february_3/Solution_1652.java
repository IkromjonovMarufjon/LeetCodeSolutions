package uz.xsoft.february_3;

import java.util.Arrays;

public class Solution_1652 {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7,8,9,10};
        decrypt(mass,-2);
    }
    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) return result;
        int[] newCode = new int[code.length + 2*k];
        System.out.println(Arrays.toString(newCode));
        System.arraycopy(code, 0, newCode,0,k);
        System.arraycopy(code, 0, newCode,k,code.length);
        System.arraycopy(code, code.length-k, newCode,newCode.length-k,k);
        int sum = 0;
        if(k > 0) {
            for (int i = 0; i < code.length; i++) {
                sum = 0;
                for (int j = k + i +1; j <=2*k + i; j++) {
                    sum += newCode[j];
                }
                result[i] = sum;
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                sum = 0;
                for (int j = i +1; j <=i + k; j++) {
                    sum += newCode[j];
                }
                result[i] = sum;
            }
        }
        return result;
    }
}
