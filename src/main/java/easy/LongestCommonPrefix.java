package easy;

import com.sun.deploy.util.StringUtils;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;

/**
 * Longest Common Prefix
 * Description
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 * <p>
 * Tags: String
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] compareArrays = {"flower", "flow", "flight"};
        System.out.println("-----------");
        String result = findCommonPrefix(compareArrays);
        System.out.println("相同的字符串是" + result);
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        int minLen = 0x7fffffff;
        for (String str : strs) minLen = Math.min(minLen, str.length());
        for (int j = 0; j < minLen; ++j)
            for (int i = 1; i < len; ++i)
                if (strs[0].charAt(j) != strs[i].charAt(j))
                    return strs[0].substring(0, j);
        return strs[0].substring(0, minLen);
    }

    /**
     * 题目的意思是找出一个数组中的相同前缀,思路是先找出数组中最小长度的字符串，然后利用数组中第一个字符串逐一和其他字符串从第一个
     * 字母到长度为最小长度的字符串进行比较，只要当前缀不一样时，就返回arrays[0].substring(0,j);j是已比较的长度，否则返回arrays[0].substring(0,miinLength);
     * 其他情况返回""
     *
     * @param arrays
     * @return
     */
    public static String findCommonPrefix(String[] arrays) {
        int minLength = findMinLength(arrays);
        //最外层为什么去字母j，里层为什么取值i呢，因为最外层存的是已比较过的字符串的长度，里层储存的是数组的元素下标*/
        //arrays[0].charAt(j) != arrays[i].charAt(j)是截取字符串第j位的字母来进行比较
        //arrays[0].substring(0,j)是截取已比较过的字符串的长度
        for (int j = 0; j < minLength; j++) {
            for (int i = 1; i < arrays.length; i++) {
                if (arrays[0].charAt(j) != arrays[i].charAt(j)) {
                    return arrays[0].substring(0, j);
                }
            }

        }
        return arrays[0].substring(0, minLength);
    }

    public static int findMinLength(String[] arrays) {
        if (null != arrays) {
            int minLength = arrays[0].length();
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].length() < minLength) {
                    minLength = arrays[i].length();
                }
            }
            return minLength;
        }
        return 0;
    }


}
