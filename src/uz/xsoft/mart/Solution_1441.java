package uz.xsoft.mart;

import java.util.ArrayList;
import java.util.List;

public class Solution_1441 {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        List<String> result = new ArrayList<>();
        int size = 0;
        int t = 1;
        while (size < target.length) {
            for (int i = t; i <target[size]-1 ; i++) {
                result.add("Push");
                result.add("Pop");
            }
            result.add("Push");
            t = target[size];
            size ++;
        }
        return result;
    }
}
