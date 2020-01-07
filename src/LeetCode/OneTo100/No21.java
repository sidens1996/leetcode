package LeetCode.OneTo100;

import DataStructure.ListNode;

/**
 * @ClassName: No21
 * @Description: leetcode第21题，merge two sorted lists
 * @Author: Achilles
 * @Date: 02/01/2020  13:39
 * @Version: 1.0
 **/

public class No21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode root = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                listNode.next = l1;
                l1 = l1.next;
                listNode = listNode.next;
            } else if (l1.val > l2.val) {
                listNode.next = l2;
                l2 = l2.next;
                listNode = listNode.next;
            } else {
                listNode.next = l1;
                l1 = l1.next;
                listNode.next.next = l2;
                l2 = l2.next;
                listNode = listNode.next.next;
            }
        }
        if (l1 != null) {
            listNode.next = l1;
        } else if (l2 != null) {
            listNode.next = l2;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode.printList(l1);
        ListNode.printList(l2);
        ListNode.printList(new No21().mergeTwoLists(l1, l2));
    }
}
