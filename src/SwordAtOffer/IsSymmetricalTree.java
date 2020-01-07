package SwordAtOffer;

import DataStructure.TreeNode;

/**
 * @ClassName: IsSysmmetricalTree
 * @Description: 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @Author: Achilles
 * @Date: 08/12/2019  11:29
 * @Version: 1.0
 **/

public class IsSymmetricalTree {

    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        } else {
            return compChild(pRoot.left, pRoot.right);
        }
    }

    private boolean compChild(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        return node1 == node2 &&
                compChild(node1.left, node2.right) &&
                compChild(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node = node.generateTree(node);
        IsSymmetricalTree isSymmetricalTree = new IsSymmetricalTree();
        System.out.println(isSymmetricalTree.isSymmetrical(node));
    }
}
