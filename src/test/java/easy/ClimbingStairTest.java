package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: huangsonglin
 * Date:2019/6/18
 * Description:
 */
public class ClimbingStairTest extends ClimbingStair {

    @Test
    public void climbingStair() {
        Assert.assertEquals(8, climbingStair(5));
    }

}