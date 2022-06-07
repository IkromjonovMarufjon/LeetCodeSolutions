package uz.xsoft.mart;

public class Solution_876 {
    public ListNode middleNode(ListNode head) {
        int size = size(head) / 2 +1;
        while (size > 0) {
            head = head.next;
            size --;
        }
        return head;
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size ++;
        }
        return size;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }
}
