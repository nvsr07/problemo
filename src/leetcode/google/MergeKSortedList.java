package leetcode.google;

public class MergeKSortedList {

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6*/

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }
        return result;
    }

    ListNode merge(ListNode result, ListNode partial) {
        ListNode response = new ListNode(0);
        ListNode head = response;
        while (result != null && partial != null) {
            if (result.val <= partial.val) {
                ListNode node = new ListNode(result.val);
                head.next = node;
                head = node;
                result = result.next;
            } else {
                ListNode node = new ListNode(partial.val);
                head.next = node;
                head = node;
                partial = partial.next;
            }
        }
        while (result != null) {
            ListNode node = new ListNode(result.val);
            head.next = node;
            head = node;
            result = result.next;
        }
        while (partial != null) {
            ListNode node = new ListNode(partial.val);
            head.next = node;
            head = node;
            partial = partial.next;
        }

        return response.next;
    }
}
