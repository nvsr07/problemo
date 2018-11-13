package leetcode.paypal;

public class ReverseLinkedList {
    /**
     *
     * Reverse a singly linked list.
     *
     * Example:
     *
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * Follow up:
     *
     * A linked list can be reversed either iteratively or recursively. Could you implement both?*/


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        if(head != null){
            result = new ListNode(head.val);
            head = head.next;
        }
        while(head != null){
            ListNode node = new ListNode(head.val);
            node.next = result;
            result = node;
            head = head.next;
        }
        return result;
    }
}
