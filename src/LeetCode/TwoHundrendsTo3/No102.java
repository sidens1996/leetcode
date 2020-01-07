package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

import java.util.*;

/**
 * @ClassName: No102
 * @Description: leetcode第102题，Binary Tree Level Order Traversal
 * @Author: Achilles
 * @Date: 04/01/2020  19:20
 * @Version: 1.0
 **/

public class No102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        TreeNode cur = new TreeNode(0);
        while (!queue.isEmpty()) {
            int count = 0;
            int curLevelCount = queue.size();
            if (!levelList.isEmpty()) {
                list.add(levelList);
            }
            levelList = new ArrayList<>();
            while (count++ < curLevelCount) {
                cur = queue.poll();
                levelList.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        if (levelList.size() != 0) {
            list.add(levelList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(new No102().levelOrder(root));
    }
}
