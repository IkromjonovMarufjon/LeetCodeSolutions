package uz.xsoft.november;

import java.util.ArrayList;
import java.util.List;

public class Solution2085 {
    public int countWords(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < words1.length; i++) {
            index = result.indexOf(words1[i]);
            if (index >= 0) result.remove(index);
            else result.add(words1[i]);
        }

        List<String> second = new ArrayList<>();
        int index2 = 0;

        for (int i = 0; i < words1.length; i++) {
            index2 = second.indexOf(words1[i]);
            if (index2 >= 0) second.remove(index2);
            else second.add(words1[i]);
        }

        int count = 0;
        for (int i = 0; i < second.size(); i++) {
            index = result.indexOf(second.get(i));
            if (index >= 0) count ++;
        }
        return result.size() - count;
    }
}
