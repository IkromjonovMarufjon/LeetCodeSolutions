package uz.xsoft.may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Solution2273 {
    public static void main(String[] args) {

    }

    public List<String> removeAnagrams(String[] words) {
        List<String> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        String value = "";

        for (String word : words) {
            value = getSort(word);
            if (keys.isEmpty() || !Objects.equals(keys.get(keys.size() - 1), value)) {
                keys.add(value);
                values.add(word);
            }
        }
        return values;
    }

    private String getSort(String st) {
        int[] vowels = new int[26];
        for (int i = 0; i < st.length(); i++) {
            vowels[st.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder(st.length());
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < vowels[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
