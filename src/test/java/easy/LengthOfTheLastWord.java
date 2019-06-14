package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/14
 * Description:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 * Tags: String
 */
public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String word = "HelloWorld";
        System.out.println(findLastWord(word));
    }

    /**
     * 题意：是让你从一个只包含大小字母和空格字符的字符串中得到最后一个单词的长度
     * 思路：从字符串最后遍历，直到发现第一个为' '的字符
     * 这个是自己实现的方法
     * 注意：判断字符是否为空的方法，中间需要敲一个空格，word.charAt(j) == ' '，word.charAt(j) == ''编译器会报错
     *
     * @param word
     * @return
     */
    public static int findLastWord(String word) {
        int length = word.length();
        for (int j = length - 1; j > 0; j--) {
            if (Character.isSpaceChar(word.charAt(j))) {
                return length - 1 - j;
            }
        }
        return length;
    }

    /**
     * 这是大佬提供的方法，简单明了
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        int end = p;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
        }
        return end - p;
    }
}
