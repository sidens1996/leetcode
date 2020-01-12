package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

/**
 * @ClassName: No160
 * @Description: leetcode第160题，Intersection of Two Linked Lists
 * @Author: Achilles
 * @Date: 12/01/2020  12:06
 * @Version: 1.0
 **/

public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode cursor1 = headA;
        ListNode cursor2 = headB;
        while (cursor1 != cursor2) {
            cursor1 = cursor1 != null ? cursor1.next : headB;
            cursor2 = cursor2 != null ? cursor2.next : headA;
        }
        return cursor1;
    }
}
