package uz.xsoft.february_3;

import java.util.ArrayList;
import java.util.List;

public class Solution_228 {
    public static void main(String[] args) {
//        final String s = "Salom";
//        s = "Salom hammaga";
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] +1) {
                end = nums[i];
            } else {
                if (end == start) list.add(start+"");
                else list.add(start + "->"+end);
                start = nums[i];
                end = nums[i];
            }
        }
        if (end == start) list.add(start+"");
        else list.add(start + "->"+end);
        return list;
    }
}
