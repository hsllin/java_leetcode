package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/13
 * Description:
 */
public class CountAndSayTest extends CountAndSay {

    @Test
    public void countNum() {
        Assert.assertEquals("31131211131221", countNum(9));
    }
}