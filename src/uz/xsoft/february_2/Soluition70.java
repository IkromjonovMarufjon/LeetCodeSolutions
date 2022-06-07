package uz.xsoft.february_2;

public class Soluition70 {
    public int climbStairs(int n) {
//        int step1 = 1;
//        int step2 = 1;
//        int step;
//
//        for (int i = 1; i < n; i++) {
//            step = step1 + step2;//2, 3
//            step1 = step2;//
//            step2 = step;// 2,
//        }
//        return step2;
        int arr[] = new int[45];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < 45; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return arr[n - 1];
    }
}
