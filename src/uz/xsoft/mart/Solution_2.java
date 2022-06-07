package uz.xsoft.mart;

/*public class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode last = null;
        ListNode temp = null;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum += l1.val + l2.val;
            temp = new ListNode(sum % 10);
            sum /=10;
            if (result == null) {
                result = temp;
                last = temp;
            } else {
                last.next = temp;
                last = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum += l1.val;
            temp = new ListNode(sum % 10);
            sum /=10;
            last.next = temp;
            last = temp;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum += l2.val;
            temp = new ListNode(sum % 10);
            sum /=10;
            last.next = temp;
            last = temp;
            l2 = l2.next;
        }
        if (sum > 0) {
            temp = new ListNode(sum);
            last.next = temp;
        }
        return result;
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
}*/
