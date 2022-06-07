package uz.xsoft.february_3;

import java.util.ArrayList;

public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ArrayList<ListNode> list = new ArrayList<>();
        while (head.next != null) {
            if (list.contains(head)) {
                return true;
            }
            list.add(head);
            head = head.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}