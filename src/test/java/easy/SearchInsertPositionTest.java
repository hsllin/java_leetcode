package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/12
 * Description:
 */
public class SearchInsertPositionTest extends SearchInsertPosition{

    @Test
    public void searchPosition() {
        int nums []={1,2,3,4,6,7,8} ;
        Assert.assertEquals(2,searchPosition(nums,3));
        Assert.assertEquals(4,searchPosition(nums,5));
    }
}