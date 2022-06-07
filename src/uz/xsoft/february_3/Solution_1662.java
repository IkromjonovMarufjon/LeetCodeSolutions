package uz.xsoft.february_3;

public class Solution_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int pos_1 = 0, pos_2 = 0, index_1 = 0, index_2 = 0;
        while (index_1 < word1.length && index_2 < word2.length) {
            if (word1[index_1].charAt(pos_1++) != word2[index_2].charAt(pos_2++)) return false;
            if (pos_1 == word1[index_1].length()) {
                pos_1 = 0;
                index_1 ++;
            }
            if (pos_2 == word2[index_2].length()) {
                pos_2 = 0;
                index_2 ++;
            }
        }
        return index_1 == word1.length && index_2 == word2.length;
    }
}
