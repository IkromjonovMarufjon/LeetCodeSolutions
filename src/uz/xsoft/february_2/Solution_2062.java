package uz.xsoft.february_2;

import java.util.HashSet;

public class Solution_2062 {
    public int countVowelSubstrings(String word) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0, j = 0; i < word.length(); i++) {
            if (!isVowel(word.charAt(i))) {
                if (!set.isEmpty()) set.clear();
                continue;
            }
            j = i;
            while (j < word.length()) {
                set.add(word.charAt(j));
                if (set.size() == 5) count++;
                j++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
