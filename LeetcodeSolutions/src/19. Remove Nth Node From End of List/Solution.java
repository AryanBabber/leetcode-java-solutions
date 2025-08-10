/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// ListNode class definition and Solution class for removing the nth node from the end of a linked list.
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

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = head;
        ListNode f = head;

        while (n-- > 0) {
            f = f.next;
        }
        if (f == null)
            return head.next;
        while (f.next != null) {
            s = s.next;
            f = f.next;
        }

        s.next = s.next.next;
        return head;
    }
}
