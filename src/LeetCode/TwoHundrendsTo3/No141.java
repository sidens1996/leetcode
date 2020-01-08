package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

/**
 * @ClassName: No141
 * @Description: leetcode第141题，Linked List Cycle
 * @Author: Achilles
 * @Date: 08/01/2020  22:14
 * @Version: 1.0
 **/

public class No141 {
    public boolean hasCycle(ListNode head) {
        if (head != null && head.next != null) {
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow.next != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }
}
