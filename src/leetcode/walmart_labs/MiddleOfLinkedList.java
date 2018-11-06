package leetcode.walmart_labs;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {

    /**
     * Definition for singly-linked list.*/
    /*
    * https://leetcode.com/problems/middle-of-the-linked-list/*/
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode node = head;

        while(node != null){
            nodes.add(node);
            node = node.next;
        }

        double middle = nodes.size() / 2;
        int index = (int) Math.ceil(middle);
        return nodes.get(index);
    }
}
