package uz.xsoft.mart;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Solution_1331 {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int[] mass = new int[arr.length];
        AtomicInteger degree = new AtomicInteger(0);
        set.forEach(integer -> {
            int d = degree.incrementAndGet();
            for (int i = 0; i < arr.length; i++) {
                if (integer == arr[i]) mass[i] = d;
            }
        });
        return mass;
    }
}
