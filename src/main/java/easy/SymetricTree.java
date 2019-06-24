package easy;

import bean.TreeNode;

import javax.transaction.TransactionRequiredException;

/**
 * Author: huangsonglin
 * Date:2019/6/24
 * Description:
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
        if (left == null || right == null){
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymetricChild(left.left, right.right) && isSymetricChild(left.right, right.left);
    }
}
