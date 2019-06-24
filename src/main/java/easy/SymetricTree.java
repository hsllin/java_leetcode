package easy;

import bean.TreeNode;

/**
 * Author: huangsonglin
 * Date:2019/6/24
 * Description:
 * Description
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * <p>
 * Bonus points if you could solve it both recursively and iteratively.
 * <p>
 * Tags: Tree, Depth-first Search, Breadth-first Search
 *
 * @link https://leetcode.com/problems/symmetric-tree/
 */
public class SymetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(5);
        System.out.println(isSymetricTree(root));
    }

    /**
     * 题意：比较一棵二叉树的是否左右对称
     * 思路：做法是先判断根节点是否为空，在深搜左右节点比较，其中对称的条件是
     * left.left和right.right，left.right和right.left的值相等
     * 关键点：深搜直到树的左节点或右节点为空的时候，比较左子树和右子树是否相等即可
     *
     * @param root
     * @return
     */
    public static boolean isSymetricTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        return isSymetricChild(root.left, root.right);

    }

    public static boolean isSymetricChild(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymetricChild(left.left, right.right) && isSymetricChild(left.right, right.left);
    }
}
