package LeetCode.OneTo100;

import DataStructure.ListNode;

/**
 * @ClassName: No83
 * @Description: leetcode83，remove duplicates from sorted list
 * @Author: Achilles
 * @Date: 04/01/2020  14:12
 * @Version: 1.0
 **/

public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode low = head;
        ListNode high = head;
        ListNode root = head;
        while (high != null) {
            if (low.val != high.val) {
                low.next = high;
                low = high;
            }
            if (high.next == null && low.val == high.val) {
                low.next = null;
            }
            high = high.next;
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);
        ListNode.printList(new No83().deleteDuplicates(listNode));
    }
}
