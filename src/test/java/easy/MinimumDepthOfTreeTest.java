package easy;

import bean.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/7/10
 * Description:
 */
public class MinimumDepthOfTreeTest extends MinimumDepthOfTree {

    @Test
    public void findMinimumDepthOfTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Assert.assertEquals("2", findMinimumDepthOfTree(root).toString());

    }
}