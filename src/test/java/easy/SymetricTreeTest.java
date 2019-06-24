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
public class SymetricTreeTest extends SymetricTree{
    @Test
    public void testIsSymetricTree(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);
        Assert.assertEquals(true,isSymetricTree(root1));
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(3);
        root2.right.right.left = new TreeNode(3);
        Assert.assertEquals(true,isSymetricTree(root1));


    }

}