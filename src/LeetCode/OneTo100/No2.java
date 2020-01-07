package LeetCode.OneTo100;

import DataStructure.ListNode;

/**
 * @ClassName: No2
 * @Description: leetcode第二题 Add two numbers
 * @Author: Achilles
 * @Date: 31/12/2019  16:14
 * @Version: 1.0
 **/

public class No2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int temp = 0;
        int flag = 0;
        ListNode listNode = null;

        return listNode;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode.printList(new No2().addTwoNumbers(l1, l2));
    }
}
