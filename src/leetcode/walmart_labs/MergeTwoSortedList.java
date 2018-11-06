package leetcode.walmart_labs;

public class MergeTwoSortedList {
    /**
     * https://leetcode.com/problems/merge-two-sorted-lists/
     */


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while (l1 != null && l2 != null) {
            ListNode node;
            if (l1.val < l2.val) {
                node = new ListNode(l1.val);
                head.next = node;
                head = node;
                l1 = l1.next;
            } else {
                node = new ListNode(l2.val);
                head.next = node;
                head = node;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            ListNode node;
            node = new ListNode(l1.val);
            head.next = node;
            head = node;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode node;
            node = new ListNode(l2.val);
            head.next = node;
            head = node;
            l2 = l2.next;
        }
        return listNode.next;
    }
}
