package SwordAtOffer;

import DataStructure.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ReverseArrayList
 * @Description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Author: Achilles
 * @Date: 09/11/2019  19:18
 * @Version: 1.0
 **/
public class ReverseArrayList {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.generateList(node);
        ReverseArrayList re = new ReverseArrayList();
        for (Integer integer : re.printListFromTailToHead(node)) {
            System.out.println(integer);
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listnode){

        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode pre = listnode;
        ListNode cur = listnode.next;
        ListNode tmp = null;
        pre.next = null;
        while (cur != null) {
            tmp =cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        while (pre!= null){
            result.add(pre.val);
            pre = pre.next;
        }
        return result;
    }
}
