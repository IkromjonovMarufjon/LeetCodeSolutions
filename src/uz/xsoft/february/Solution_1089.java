package uz.xsoft.february;

public class Solution_1089 {
    public void duplicateZeros(int[] arr) {
        int countZero = 0;
        for (int i : arr) {
            if (i == 0) countZero++;
        }

        for (int i = arr.length - countZero-1; i >=0 ; i--) {
            if (arr[i] != 0){}
        }
    }
}
