package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/17
 * Description:
 */
public class AddBinaryTest extends AddBinary{

    @Test
    public void addBinaryTwo() {
        Assert.assertEquals("10101",addBinaryTwo("110","1111"));
    }
}