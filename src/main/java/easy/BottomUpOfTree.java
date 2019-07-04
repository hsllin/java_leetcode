package easy;

import bean.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: huangsonglin
 * Date:2019/7/4
 * Description:
 * Description
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * Tags: Tree, Breadth-first Search
 *
 * @link
 */
public class BottomUpOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> resultList = getBottomUpOfTree(root);
        for (List<Integer> list : resultList) {
            System.out.println(list.toString());
        }
    }

    /**
     * 题意是从下往上按层遍历二叉树，每一层是从左到右，按层遍历，很明显，宽搜第一时间符合，因为是从下往上，所以插入的时候每次插到链表头即可。
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> getBottomUpOfTree(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null) {
            return Collections.emptyList();
        }
        LinkedList<TreeNode> p = new LinkedList<TreeNode>();
        p.add(root);
        while (!p.isEmpty()) {
            List<Integer> sub = new LinkedList<Integer>();
            int size = p.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = p.remove();
                int val = node.val;
                sub.add(val);
                if (node.left != null) {
                    p.add(node.left);
                }
                if (node.right != null) {
                    p.add(node.right);
                }
            }
            list.add(0, sub);

        }
        return list;
    }
}
