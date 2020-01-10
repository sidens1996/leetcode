package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;

/**
 * @ClassName: No142
 * @Description: leetcode第142题，Linked List Cycle II
 * @Author: Achilles
 * @Date: 08/01/2020  22:57
 * @Version: 1.0
 **/

public class No142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        // 记录快慢指针第一次相遇的位置
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && slow.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast != slow) {
            return null;
        }
        // 快指针重新指向头节点，两者再次相遇的位置即为入口节点
        fast = head;
        while (fast.next != null && slow.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
