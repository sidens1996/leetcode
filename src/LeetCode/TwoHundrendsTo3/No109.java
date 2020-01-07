package LeetCode.TwoHundrendsTo3;

import DataStructure.ListNode;
import DataStructure.TreeNode;

import java.util.ArrayList;

/**
 * @ClassName: No109
 * @Description: leetcode第109题，sortedListToBST
 * @Author: Achilles
 * @Date: 05/01/2020  14:40
 * @Version: 1.0
 **/

public class No109 {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        Object[] nums = arrayList.toArray();
        return sortedListToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedListToBST(Object[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + ((right - left) >> 1);
        TreeNode root = new TreeNode((int)nums[mid]);
        root.left = sortedListToBST(nums, left, mid - 1);
        root.right = sortedListToBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(0);
        root.next = new ListNode(1);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        new No109().sortedListToBST(root).levelOrder();
    }
}
