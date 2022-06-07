package uz.xsoft.mart;

public class Solution_237 {
    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        node= null;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {val = x;}
    }
}
