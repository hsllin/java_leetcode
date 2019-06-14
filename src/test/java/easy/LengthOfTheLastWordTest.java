package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/14
 * Description:
 */
public class LengthOfTheLastWordTest extends LengthOfTheLastWord {

    @Test
    public void findLastWord() {
        String s1 = "Hello World";
        String s2 = "HelloWorld";
        Assert.assertEquals(5, findLastWord(s1));
        Assert.assertEquals(10, findLastWord(s2));
    }
}