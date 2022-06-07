package uz.xsoft.february_2;

public class LetCode_69 {
    public int mySqrt(int x) {
        int right = 46340;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else return mid;

        }
        return right;
    }
}
// x = 360
// 1000 -> 31
/*
 0 - 31
 mid = 15
 15 - 31
 mid = 23
 15 - 23
 mid = 19
 15 - 19
 mid = 17
 17 - 19
 mid = 18
 17 - 18

 O(log(n))

 log(1000) -> 10
 1) 0 - 1024  -> 512
 2) 512 - 1024 -> 768
 3) 512 - 768 -> 640
 4) 640 - 768 -> 704
 5) 640 - 704 -> 672
 6) 672 - 704 -> 688
 7) 688 - 704 -> 696
 8) 688 - 696 -> 692
 9) 688 - 692 -> 690
 10)
 */

