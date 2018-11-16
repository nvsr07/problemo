package leetcode.salesforce;

public class RemoveDuplicatedFromSortedList {

    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * Example 1:
     *
     * Input: 1->1->2
     * Output: 1->2
     * Example 2:
     *
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     * */

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if(head != null){
            ListNode result = new ListNode(head.val);
            ListNode node = result;
            head = head.next;
            while(head != null ){
                if(node.val != head.val){
                    ListNode nod = new ListNode(head.val);
                    node.next = nod;
                    node = nod;
                }
                head = head.next;
            }
            return result;
        }
        return head;
    }
}
