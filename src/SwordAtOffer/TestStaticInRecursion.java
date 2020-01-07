package SwordAtOffer;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: TestStaticInRecursion
 * @Description: 测试leetcode第1305题，使用静态变量结果与测试案例不符合
 * @Author: Achilles
 * @Date: 31/12/2019  15:04
 * @Version: 1.0
 **/

public class TestStaticInRecursion {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    static List<Integer> list = new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        preOrder(root1);
        preOrder(root2);
        Collections.sort(list);
        return list;
    }

    public void preOrder(TreeNode root){
        if(root != null){
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        // 构建测试案例
        // [0,-10,10]
        // [5,1,7,0,2]
        TreeNode root1 = new TreeNode(-10);
        TreeNode root2 = new TreeNode(5);
        root1.left = new TreeNode(0);
        root1.right = new TreeNode(10);

        root2.left = new TreeNode(1);
        root2.left.left = new TreeNode(0);
        root2.left.right = new TreeNode(2);
        root2.right = new TreeNode(7);
        System.out.println(new TestStaticInRecursion().getAllElements(root1, root2));
        System.out.println(Math.min(1,1));
    }
}
