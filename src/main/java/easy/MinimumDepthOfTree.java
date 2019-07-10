package easy;

import bean.TreeNode;

/**
 * Author: huangsonglin
 * Date:2019/7/10
 * Description:
 */
public class MinimumDepthOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(findMinimumDepthOfTree(root));
    }

    public static Integer findMinimumDepthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(findMinimumDepthOfTree(root.left), findMinimumDepthOfTree(root.right));
    }
}
