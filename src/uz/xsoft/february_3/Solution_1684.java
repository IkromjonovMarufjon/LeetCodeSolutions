package uz.xsoft.february_3;

public class Solution_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean bool = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) < 0) {
                    bool = false;
                    j = words[i].length();
                }
            }
            if(bool) count ++;
        }
        return count;
    }
}
