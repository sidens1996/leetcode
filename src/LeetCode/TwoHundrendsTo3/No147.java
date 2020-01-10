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
