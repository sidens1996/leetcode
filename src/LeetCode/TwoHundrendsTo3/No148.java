package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

/**
 * @ClassName: No148
 * @Description: leetcode第148题，Sort List
 * @Author: Achilles
 * @Date: 11/01/2020  14:11
 * @Version: 1.0
 **/

public class No148 {
    public ListNode sortList(ListNode head) {
//        ListNode newHead = new ListNode(0);
//        ListNode temp = newHead;
//        for (ListNode cursor1 = head; cursor1 != null; cursor1 = temp) {
//            ListNode cursor2 = newHead;
//            while (cursor2.next != null && cursor1.val > cursor2.next.val) {
//                cursor2 = cursor2.next;
//            }
//            temp = cursor1.next;
//            cursor1.next = cursor2.next;
//            cursor2.next = cursor1;
//        }
//        return newHead.next;
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head, pre = null;
        while (fast.next != null && fast.next.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                cur = cur.next;
                left = left.next;
            } else {
                cur.next = right;
                cur = cur.next;
                right = right.next;
            }
        }
        if (left != null) {
            cur.next = left;
        }
        if (right != null) {
            cur.next = right;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(-5);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(5);
        ListNode.printList(new No148().sortList(head));
    }
}
