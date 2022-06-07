package uz.xsoft.february;

public class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int repeatCount = arr.length / 2;
        int chegara = arr.length / 2 + arr.length % 2;

        for (int i = 0; i < arr.length; i++) {
            if (i < chegara) {
                sum += arr[i] * (repeatCount + i);
                System.out.println(arr[i] + " -> " + (repeatCount + i));
            } else {
                sum += arr[i] * (repeatCount + arr.length - i);
                System.out.println(arr[i] + " -> " + (repeatCount + arr.length - i));
            }
        }
        return sum;
    }
}
