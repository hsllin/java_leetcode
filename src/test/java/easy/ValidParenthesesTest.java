package easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest extends ValidParentheses {

    @Test
    public void isValid() {
        String testString1 = "[()]";
        String testString2 = "[][]{[}]";
        boolean result1 = isValid(testString1);
        boolean result2 = isValid(testString2);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }
}