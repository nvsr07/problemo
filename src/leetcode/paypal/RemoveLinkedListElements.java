package leetcode.paypal;

public class RemoveLinkedListElements {

    /**
     * Remove all elements from a linked list of integers that have value val.
     *
     * Example:
     *
     * Input:  1->2->6->3->4->5->6, val = 6
     * Output: 1->2->3->4->5*/


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode removeElements(ListNode head, int val) {
            ListNode result = new ListNode(0);
            ListNode node = result;

            while(head != null){
                if(head.val != val){
                    ListNode singleNode = new ListNode(head.val);
                    node.next = singleNode;
                    node = singleNode;
                }
                head = head.next;
            }
            return result.next;
        }
    }

