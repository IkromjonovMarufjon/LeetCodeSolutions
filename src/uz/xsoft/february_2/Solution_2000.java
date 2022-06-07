package uz.xsoft.february_2;

public class Solution_2000 {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                i = word.length();
            }
        }
        if (index < 0) return word;
        return new StringBuilder(word.substring(0,index)).reverse().toString() + word.substring(index);
    }
}
