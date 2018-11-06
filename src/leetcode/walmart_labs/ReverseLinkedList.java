package leetcode.walmart_labs;

public class ReverseLinkedList {

    /*
    * https://leetcode.com/problems/reverse-linked-list/
    * */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        if (head != null) {
            result = new ListNode(head.val);
            head = head.next;
        }
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = result;
            result = node;
            head = head.next;
        }
        return result;
    }
}
