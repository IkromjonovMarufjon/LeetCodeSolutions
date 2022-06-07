package uz.xsoft.january;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution1544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result = " + makeGood("aBbA"));
    }

    public static String makeGood(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.charAt(i); i++) {
            if (deque.isEmpty()) {
                deque.offer(s.charAt(i));
                continue;
            }
            if ((deque.peekLast() ^ 32) == s.charAt(i)) {
                deque.pollLast();
            } else deque.offer(s.charAt(i));
        }
        char[] mass = new char[deque.size()];
        int pos = 0;
        for (Character character : deque) {
            mass[pos++] = character;
        }
        return new String(mass);
    }
}
