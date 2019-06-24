package easy;

import bean.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * Author: huangsonglin
 * Date:2019/6/24
 * Description:
 * Given two binary trees, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * Output: true
 * Example 2:
 * <p>
 * Input:     1         1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * Output: false
 * Example 3:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * Output: false
 * Tags: Tree, Depth-first Search
 *
 * @link
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = null;
        p.right = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(2);
        System.out.println(isSameTree(q, p));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

}
