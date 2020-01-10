package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: No145
 * @Description: leetcode第145题，Binary Tree Postorder Traversal
 * @Author: Achilles
 * @Date: 10/01/2020  17:57
 * @Version: 1.0
 **/

public class No145 {

    List<Integer> list1 = new ArrayList<>();

    public List<Integer> postorderTraversal1(TreeNode root) {
        if (root != null) {
            postorderTraversal1(root.left);
            postorderTraversal1(root.right);
            list1.add(root.val);
        }
        return list1;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list2 = new ArrayList<>();
        if (root == null) {
            return list2;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if ((cur.left == null && cur.right == null)
                    || (pre != null && (pre == cur.left || pre == cur.right))) {
                list2.add(cur.val);
                pre = cur;
                // cur出栈
                stack.pop();
            }else {
                stack.push(cur.right);
                stack.push(cur.left);
            }
        }
        return list2;
    }

    public List<Integer> postorderTraversal3(TreeNode root) {
        List<Integer> list3 = new ArrayList<>();
        if (root == null) {
            return list3;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
            list3.add(0, cur.val);
        }
        return list3;
    }
}
