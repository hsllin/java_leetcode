package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/18
 * Description:
 * Climbing Stairs
 * Description
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * Tags: Dynamic Programming
 *
 * @link solution:https://leetcode.com/articles/climbing-stairs/
 */
public class ClimbingStair {
    public static void main(String[] args) {
        System.out.println(climbingStair(5));
    }

    /**
     * 题意是爬楼梯，每次你只能爬一步或者两步，问到顶层共有多少种方案。
     * 思路：本题可以通过动态规划的思想来解答，dynamic programming,动态规划算法的核心就是记住已经解决过的子问题的解
     * 我们可以通过假设我在上最后一步就达到了顶点的位置，最后一步有1step，或者2step的情况，所以dn[n] = d[n-1]+d[n-2],
     * d[n-1]表示走到顶点的上一步步长为1step经过的所有情况，的d[n-2]表示走到顶点的上一步步长为2step经过的所有情况，
     * 所以将这两种情况加起来就能得到所有结果，而dp[n]并不关心你是怎么求出来的，这样算法会一直递归到求dp[1]和dp[2]的值
     *
     * @param n
     * @return
     */
    public static int climbingStair(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
