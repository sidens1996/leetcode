package SwordAtOffer;

import DataStructure.ListNode;

/**
 * @ClassName: DeleteRepeatedNodes
 * @Description: 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
 * @Author: Achilles
 * @Date: 19/11/2019  18:40
 * @Version: 1.0
 **/

public class DeleteRepeatedNodes {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        // 0 1 2 3 3 4 4 5
        // 怎么处理第一个和第二个相同的情况，有一个思路是构造第一个节点
        // 0 1 1 2 3 3 4 5
        ListNode newNode = new ListNode(0);
        newNode.next = pHead;
        ListNode pre = newNode;
        ListNode cur = pHead;
        while (cur != null) {
            if ( cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        newNode.next.printList(newNode.next);
        return newNode.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.generateList(node);
        DeleteRepeatedNodes deleteRepeatedNodes = new DeleteRepeatedNodes();
        deleteRepeatedNodes.deleteDuplication(node);

    }
}



