package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

/**
 * @ClassName: No147
 * @Description: leetcode第147题，Insertion Sort List
 * @Author: Achilles
 * @Date: 10/01/2020  21:59
 * @Version: 1.0
 **/

public class No147 {

    /**
     * 新建一个头结点，遍历原始链表的元素，找到在新链表中的位置后插入
     * 新建一个头结点的方法可以免去每次重新找头结点的烦恼
     *
     * 更精妙的思路是采用类似归并排序的方法来解决问题
     * private ListNode sentinel = new ListNode(-1);
     *
     *     public ListNode insertionSortList(ListNode head) {
     *         return sortList(head);
     *     }
     *
     *     private ListNode sortList(ListNode head) {
     *         int size = getSize(head);
     *         return internelSortList(head, size);
     *     }
     *
     *     private ListNode internelSortList(ListNode head, int size) {
     *         if (size < 5) return sortInConstantTime(head, size);
     *
     *         int mid = size >> 1;
     *         ListNode midNode = getNode(head, mid);
     *         ListNode lower = internelSortList(head, mid);
     *         ListNode higher = internelSortList(midNode, size - mid);
     *         return mergeSortedList(lower, higher);
     *     }
     *
     *     private int getSize(ListNode head) {
     *         int size = 0;
     *         while (head != null) {
     *             ++size;
     *             head = head.next;
     *         }
     *         return size;
     *     }
     *
     *     private ListNode getNode(ListNode head, int index) {
     *         while (index > 0) {
     *             head = head.next;
     *             --index;
     *         }
     *         return head;
     *     }
     *
     *     // size > 1 is recommended
     *     private ListNode sortInConstantTime(ListNode head, int size) {
     *         sentinel.next = head;
     *         ListNode traveller, before, next;
     *         for (int i = 1; i < size; ++i) {
     *             before = sentinel;
     *             traveller = sentinel.next;
     *             for (int j = 0; i + j < size; ++j) {
     *                 next = traveller.next;
     *                 if (traveller.val > next.val) {
     *                     before.next = next;
     *                     traveller.next = next.next;
     *                     next.next = traveller;
     *                 } else {
     *                     traveller = next;
     *                 }
     *                 before = before.next;
     *             }
     *             if (i == 1) traveller.next = null;
     *         }
     *         return sentinel.next;
     *     }
     *
     *     private ListNode mergeSortedList(ListNode a, ListNode b) {
     *         ListNode last = sentinel;
     *         while (a != null && b != null) {
     *             if (a.val <= b.val) {
     *                 last.next = a;
     *                 last = a;
     *                 a = a.next;
     *             } else {
     *                 last.next = b;
     *                 last = b;
     *                 b = b.next;
     *             }
     *         }
     *         if (a != null) last.next = a;
     *         else if (b != null) last.next = b;
     *         return sentinel.next;
     *     }
     */
    public ListNode insertionSortList(ListNode head) {
        // 新建一个链表头进行插入，免去每次重新找头的烦恼
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        for (ListNode cursor1 = head; cursor1 != null; cursor1 = temp) {
            ListNode cursor2 = newHead;
            while (cursor2.next != null && cursor1.val > cursor2.next.val) {
                cursor2 = cursor2.next;
            }
            temp = cursor1.next;
            cursor1.next = cursor2.next;
            cursor2.next = cursor1;
        }
        return newHead.next;
    }
}
