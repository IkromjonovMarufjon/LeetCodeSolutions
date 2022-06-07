package uz.xsoft.mart;

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode h = null;

        while (head.next != null) {
            temp = new ListNode(head.val);
            temp.next = h;
            h = temp;
            head = head.next;
        }
        return temp;
    }
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

