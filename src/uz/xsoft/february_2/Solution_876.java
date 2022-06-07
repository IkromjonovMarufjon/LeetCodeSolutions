package uz.xsoft.february_2;

public class Solution_876 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode _head = head;
        while (head.next != null) {
            count ++;
            head = head.next;
        }
        ListNode result = new ListNode();
        System.out.println(count);
        return _head;
    }
}

class ListNode {
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