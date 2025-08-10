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

// ListNode class (only for this. Don't need it in the solution)
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
    public ListNode swapPairs(ListNode head) {
        int length = len(head);
        ListNode d = new ListNode(0, head);
        ListNode p = d;
        ListNode c = head;

        for (int i = 0; i < length / 2; ++i) {
            ListNode next = c.next;
            c.next = next.next;
            next.next = c;
            p.next = next;
            p = c;
            c = c.next;
        }

        return d.next;
    }

    private int len(ListNode h) {
        int l = 0;
        for (ListNode c = h; c != null; c = c.next) {
            ++l;
        }

        return l;
    }
}