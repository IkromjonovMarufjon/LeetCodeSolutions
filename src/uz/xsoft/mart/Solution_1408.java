package uz.xsoft.mart;

import java.util.ArrayList;
import java.util.List;

public class Solution_1408 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hello";
        System.out.println(s.contains(t));
    }

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j == i) continue;
                if (words[i].contains(words[j])) {
                    result.add(words[j]);
                    j = words.length;
                }
            }
        }
        return result;
    }
}
