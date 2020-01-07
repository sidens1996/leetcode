package DataStructure;

/**
 * @ClassName: ListNode
 * @Description: 数据结构，链表
 * @Author: Achilles
 * @Date: 03/12/2019  12:24
 * @Version: 1.0
 **/
public class ListNode{

    //为了方便起见，这里不设置getter和setter，所有变量都设置成public，暂时不考虑权限问题
    public int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    public static void printList(ListNode listNode) {
        while (listNode != null) {
            if (listNode.next != null) {
                System.out.print(listNode.val + "->");
            }else {
                System.out.println(listNode.val);
            }
            listNode = listNode.next;
        }
    }

    public void generateList(ListNode node) {
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        node.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
    }
}
