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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode l : lists) {
            if (l != null)
                minHeap.offer(l);
        }

        while (!minHeap.isEmpty()) {
            ListNode min = minHeap.poll();
            if (min.next != null)
                minHeap.offer(min.next);
            curr.next = min;
            curr = curr.next;
        }

        return dummy.next;
    }
}