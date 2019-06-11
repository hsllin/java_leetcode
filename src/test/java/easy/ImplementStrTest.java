package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/11
 * Description:
 */
public class ImplementStrTest extends ImplementStr {

    @Test
    public void findIndex() {
        String haystack = "asdhkhh";
        String needle1 = "hh";
        String needle2 = "hkl";
        String needle3 = "";
        int result1 = findIndex(haystack, needle1);
        int result2 = findIndex(haystack, needle2);
        int result3 = findIndex(haystack, needle3);

        Assert.assertEquals(5, result1);
        Assert.assertEquals(-1, result2);
        Assert.assertEquals(0, result3);
    }
}