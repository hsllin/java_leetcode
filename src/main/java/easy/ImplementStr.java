package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/11
 * Description:
 * Description
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * Tags:** Two Pointers, String
 */
public class ImplementStr {
    public static void main(String[] args) {
        String haystack = "abcdef";
        String needle = "ef";
        System.out.print(findIndex(haystack, needle));
    }

    /**
     * 题意是从主串中找到子串的下标
     * 思路：直接循环比较，当子串长度大于主串长度时返回-1
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int findIndex(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l2 == 0) {
            return 0;
        }
        if (l2 > l1) {
            return -1;
        }
        for (int i = 0; i < l1; i++) {
            //这个return用的很巧妙，
            // 这里的i时已经比较过的主串的下标，k时已比较过的子串的下标，当主串剩下未比较的长度小于子串的长度时说明找不到
            if (i + l2 > l1) {
                return -1;
            }
            for (int k = 0; ; k++) {
                //当已经比较过的字符串长度和needle的相等，子串在主串中找到了
                if (k == l2) {
                    return i;
                }
                //这里为什么用needle.charAt(k) != haystack.charAt(i + k)呢，因为如果找到了第一个相等的char，k必为0，此时主串的下标未i，
                // 而循环此时在内层，为了继续比较余下的char相不相等，主串的下标要跟子串的下标移动相同的长度
                if (needle.charAt(k) != haystack.charAt(i + k)) {
                    break;
                }

            }
        }
        return -1;
    }

}
