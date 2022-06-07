package uz.xsoft.mart;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution_146 {
    class LRUCache {
        private HashMap<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        private int size;

        public LRUCache(int capacity) {
            size = capacity;
        }

        public int get(int key) {
            Pair<Integer, Integer> pair = map.getOrDefault(key, new Pair<>(-1,0));
            if (pair.getKey() != -1 )map.put(key, new Pair<>(pair.getKey(), (pair.getValue()) +1));
            return pair.getKey();
        }

        public void put(int key, int value) {
            if (size > 0) {
                if (map.containsKey(key)) {
                    Pair<Integer, Integer> pair = map.get(key);
                    map.put(key, new Pair<>(pair.getKey(), (pair.getValue()) +2));
                } else {
                    map.put(key, new Pair<>(value, 2));
                }
            } else {
                int k = getMinUsedData();
                System.out.println(k);
                map.remove(k);
                map.put(key, new Pair<>(value, 2));
            }
        }

        private int getMinUsedData() {
            AtomicInteger min =  new AtomicInteger(Integer.MAX_VALUE);
            AtomicInteger k =  new AtomicInteger(0);
            map.forEach((key, value) -> {
                System.out.println("(" + key + " ; " + value + ")");
                if (min.get() > value.getValue()) {
                    min.set(value.getValue());
                    k.set(key);
                }
            });
            return k.get();
        }
    }
}

