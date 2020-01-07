package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: No113
 * @Description: leetcode第113题，pathSum II
 * @Author: Achilles
 * @Date: 05/01/2020  22:15
 * @Version: 1.0
 **/

public class No113 {
    List<List<Integer>> paths = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return paths;
        } else {
            path.add(root.val);
            if (sum - root.val == 0 && root.left == null && root.right == null) {
                paths.add(new ArrayList<>(path));
            }
            pathSum(root.left, sum - root.val);
            pathSum(root.right, sum - root.val);
            path.remove(path.size() - 1);
            return paths;
        }
    }
}
