package easy;

import bean.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/24
 * Description:
 */
public class SameTreeTest extends SameTree{

    @Test
    public void isSameTree() {
        TreeNode p = new TreeNode(1);
        p.left = null;
        p.right = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(2);
        Assert.assertEquals(true,isSameTree(p,q));
    }
}