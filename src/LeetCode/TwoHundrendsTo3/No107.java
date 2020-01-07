package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: No107
 * @Description: leetcode第107题，Binary Tree Level Order Traversal II
 * @Author: Achilles
 * @Date: 04/01/2020  21:42
 * @Version: 1.0
 **/

public class No107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        List<Integer> levelList = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = new TreeNode(0);
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            if (!levelList.isEmpty()) {
                list.addFirst(levelList);
            }
            int count = 0;
            int levelCount = queue.size();
            levelList = new LinkedList<>();
            while (count++ < levelCount) {
                cur = queue.poll();
                levelList.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if ((cur.right != null)) {
                    queue.offer(cur.right);
                }
            }
        }
        if (!levelList.isEmpty()) {
            list.addFirst(levelList);
        }
        return list;
    }
}
