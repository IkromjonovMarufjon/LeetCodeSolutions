package uz.xsoft.january;

import java.util.ArrayList;

public class Solution2156 {
    public static void main(String[] args) {
        String s = "Leetcode";

    }

    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        ArrayList<Integer> mods = new ArrayList<Integer>(s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            mods.add(val(s.charAt(i)) * pow(power, i) / modulo);
        }
        for (int i = 0; i < mods.size(); i++) {
            System.out.println(mods.get(i) + " , ");
        }
        return "";
    }

    private int val(char ch) {
        return ch - 'a' + 1;
    }

    private int pow(int amount, int degree) {
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= amount;
        }
        return result;
    }
}
