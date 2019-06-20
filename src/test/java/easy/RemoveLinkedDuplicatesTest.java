package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/20
 * Description:
 */
public class RemoveLinkedDuplicatesTest extends RemoveLinkedDuplicates{

    @Test
    public void deleteDuplicateNode() {
        LinkNode node = new LinkNode(1);
        node.next = new LinkNode(1);
        node.next.next = new LinkNode(2);
        LinkNode equalNode = new LinkNode(1);
        Assert.assertEquals(2,deleteDuplicateNode(node).next.index);
    }
}