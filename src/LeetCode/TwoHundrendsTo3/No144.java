package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: No144
 * @Description: leetcode第144题，Binary Tree Preorder Traversal
 * @Author: Achilles
 * @Date: 10/01/2020  16:41
 * @Version: 1.0
 **/

public class No144 {

//    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root != null) {
//            result.add(root.val);
//            preorderTraversal(root.left);
//            preorderTraversal(root.right);
//        }
//        return result;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }
}
