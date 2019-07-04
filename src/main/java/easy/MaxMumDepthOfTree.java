package easy;

import bean.TreeNode;

/**
 * Author: huangsonglin
 * Date:2019/7/4
 * Description:
 * Maximum Depth of Binary Tree
 * Description
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 * Tags: Tree, Depth-first Search
 * @link https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxMumDepthOfTree {
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("树的最大深度为："+findMaxMumDepthOfTree(root));
    }

    /**
     * 获取一个树的最大深度
     *题意是求一棵树的最大深度，对左右子树进行遍历即可
     * @param node
     * @return
     */
    public static int findMaxMumDepthOfTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(findMaxMumDepthOfTree(node.left), findMaxMumDepthOfTree(node.right));
    }
}
