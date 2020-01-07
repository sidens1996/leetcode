package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: TreeNode
 * @Description: 数据结构，二叉树
 * @Author: Achilles
 * @Date: 03/12/2019  12:23
 * @Version: 1.0
 **/
public class TreeNode {
    static int count = 1;
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode (int x){
        val = x;
    }

    public TreeNode generateTree(TreeNode node) {

        if (count >= 100) {
            return node;
        }

        //this.val = (int) (Math.random() * 100);
        node = new TreeNode((int) (Math.random()*100));

        count++;
        if (node.val % 2 == 0) {
            node.right = generateTree(node.right);
        }else {
            node.left = generateTree(node.left);
            node.right = generateTree(node.right);
        }

        return node;
    }

    public void levelOrder() {

        if (this == null) {
            return ;
        }
        Queue<TreeNode> former = new LinkedList<TreeNode>();
        System.out.println(this.val);
        former.add(this);
        while (!former.isEmpty()) {
            //这个arraylist存储当前行
            ArrayList<TreeNode> current = new ArrayList<TreeNode>();
            for (TreeNode treeNode : former) {
                if (treeNode.left != null) {
                    current.add(treeNode.left);
                    System.out.print(treeNode.left.val + "\t");
                } else{
                    System.out.print("null" + "\t");
                }
                if (treeNode.right != null) {
                    current.add(treeNode.right);
                    System.out.print(treeNode.right.val + "\t");
                } else {
                    System.out.print("null" + "\t");
                }
            }
            System.out.println();
            former.clear();
            former.addAll(current);
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
        }
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        inOrder(node.left);
        if (node != null) {
            System.out.println(node.val);
        }
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        postOrder(node.left);
        postOrder(node.right);
        if (node != null) {
            System.out.println(node.val);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = null;
        treeNode.generateTree(treeNode);
        treeNode.levelOrder();
    }
}
