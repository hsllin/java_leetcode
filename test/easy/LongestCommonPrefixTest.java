package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest extends LongestCommonPrefix{

    @Test
    public void longestCommonPrefix() {
        String[] compareArrays1 = {"flower", "flow", "flight"};
        String[] compareArrays2 = {"abc","bc","bc"};
        String result1 =  findCommonPrefix(compareArrays1);
        String result2 = findCommonPrefix(compareArrays2);
        Assert.assertEquals("fl",result1);
        Assert.assertEquals("",result2);


    }
}