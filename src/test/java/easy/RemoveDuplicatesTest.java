package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/10
 * Description:
 */
public class RemoveDuplicatesTest extends RemoveDuplicates{

    @Test
    public void removeDuplicateArrays() {
        int [] testArrays = {1,2,3,3,4,4,4,4,4};
        Assert.assertEquals(4,removeDuplicateArrays(testArrays));
    }
}