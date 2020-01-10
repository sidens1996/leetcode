package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

import java.util.List;

/**
 * @ClassName: No143
 * @Description: leetcode第143题，Reorder List
 * @Author: Achilles
 * @Date: 08/01/2020  22:39
 * @Version: 1.0
 **/

public class No143 {
    public void reorderList(ListNode head) {
        if (head != null) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            //slow为中点
            ListNode newHead = slow.next;
            slow.next = null;
            newHead = reverseLinkedList(newHead);
            ListNode cursor1 = head;
            ListNode cursor2 = newHead;
            while (cursor1 != null && cursor2 != null) {
                cursor1 = cursor1.next;
                head.next = newHead;
                cursor2 = cursor2.next;
                newHead.next = cursor1;
                head = cursor1;
                newHead = cursor2;
            }
        }
    }

    private ListNode reverseLinkedList(ListNode newHead) {
        if (newHead == null) {
            return null;
        }
        ListNode pre = newHead;
        ListNode cur = newHead.next;
        ListNode next = null;
        while (cur != null) {//使用头插法构建链表
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        newHead.next = null;
        return pre;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        root.next.next.next.next.next.next = new ListNode(7);
        new No143().reorderList(root);
        ListNode.printList(root);
    }
}
