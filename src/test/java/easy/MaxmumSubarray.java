package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/14
 * Description:
 * Maximum Subarray
 * Description
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * <p>
 * Tags: Array, Divide and Conquer, Dynamic Programming
 */
public class MaxmumSubarray {
    public static void main(String[] args) {
        int[] testArray = {-1, 2, -4, 5, -7, 8, 9, -20};
        int max = findMaxMumSum(testArray);
        System.out.print(max);
    }

    /**
     * 题意是求数组中子数组的最大和，这种最优问题一般第一时间想到的就是动态规划，
     * 我们可以这样想，当部分序列和大于零的话就一直加下一个元素即可，并和当前最大值进行比较，
     * 如果出现部分序列小于零的情况，那肯定就是从当前元素算起。
     * 其转移方程就是 dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
     * 由于我们不需要保留 dp 状态，故可以优化空间复杂度为 1，
     * 即 dp = nums[i] + (dp > 0 ? dp : 0);
     * 我的理解：就是比较相邻两个数的和是否大于0，如果是就将这个结果继续和下一个相邻的相加
     * @param nums
     * @return
     */
    public static int findMaxMumSum(int[] nums) {
        int length = nums.length;
        int dept = nums[0];
        int max = dept;
        for (int i = 1; i < length; i++) {
            //注意，要给dept > 0 ? dept : 0加上括号
            dept = nums[i] + (dept > 0 ? dept : 0);
            if (dept > max) {
                max = dept;
            }
        }
        return max;
    }
}
