package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/14
 * Description:
 */
public class MaxmumSubarrayTest extends MaxmumSubarray{

    @Test
    public void findMaxMumSum() {
        int [] testNums = {-1, 2, -4, 5, -7, 8, 9, -20};
        Assert.assertEquals(17,findMaxMumSum(testNums));
    }
}