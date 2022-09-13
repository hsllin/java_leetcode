package easy;

import lombok.extern.slf4j.Slf4j;

/**
 * ## .有效的字母异位词
 * <p>
 * [力扣题目链接](https://leetcode.cn/problems/valid-anagram/)
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * <p>
 * **说明:**
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 思路：可以将考虑使用哈希表法，不考虑大小写的情况下，字母有26个，通过char-'c' 进行哈希映射，得到数字下标，将对应下标数字+1，
 * 遍历目标字符t的时候对s的数组进行-1操作，然后遍历最后的数组，只要有1位是1，说明这两个字符不全一样
 */
@Slf4j
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] array = new char[26];
        for (char c : s.toCharArray()) {
            array[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            array[c - 'a'] -= 1;
        }
        for (int i : array) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        log.info(isAnagram(s1, t1) + "");
        log.info(isAnagram(s2, t2) + "");
    }
}
