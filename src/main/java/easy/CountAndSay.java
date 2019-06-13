package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/13
 * Description:
 * Count and Say
 * Description
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * <p>
 * 11 is read off as "two 1s" or 21.
 * <p>
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 * Tags: String
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countNum(1));
        System.out.println(countNum(2));
        System.out.println(countNum(3));
        System.out.println(countNum(4));
        System.out.println(countNum(5));
        System.out.println(countNum(6));
        System.out.println(countNum(7));
        System.out.println(countNum(8));
        System.out.println(countNum(9));
    }

    /**
     * 题意是数和说，根据如下序列 1, 11, 21, 1211, 111221, ...，求第 n 个数，规则很简单,就是数和说，
     * 数就是数这个数数字有几个，说就是说这个数，所以 1 就是 1 个 1：11,11 就是有 2 个 1：21，21
     * 就是 1 个 2、1 个 1：1211，可想而知后面就是 111221，思路的话就是按这个逻辑模拟出来即可。
     * 关键点：1.统计字符串中重复的字符，使用count统计，当有字符不等时需要重置 2.当比较的下标走到末尾时别忘了把末尾的字符也加上
     * 3.最外层使用了一个循环，用来将每一次字符串进行迭代更新
     *
     * @param num
     * @return
     */
    public static String countNum(int num) {
        StringBuilder sb = new StringBuilder(12);
        String s = "1";

        for (int j = 1; j < num; j++) {
            if (s.length() == 1) {
                s = "11";
            } else {
                sb = new StringBuilder(12);
                int count = 1;
                for (int i = 1; i < s.length(); i++) {
                    char left = s.charAt(i - 1);
                    char right = s.charAt(i);
                    if (left == right) {
                        count++;
                    } else {
                        sb.append(count).append(left);
                        count = 1;
                    }
                    if (i == s.length() - 1) {
                        sb.append(count).append(right);
                    }
                }
                s = sb.toString();
            }
        }
        return s;
    }

    /**
     * 这个方法是题目大佬给出来的解决方法，在写自己的实现之前没有看过他的方案，
     * 之后一对比发现写法是差不多的
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String str = "1";
        while (--n > 0) {
            int times = 1;
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();
            int len = chars.length;
            for (int j = 1; j < len; j++) {
                if (chars[j - 1] == chars[j]) {
                    times++;
                } else {
                    sb.append(times).append(chars[j - 1]);
                    times = 1;
                }
            }
            str = sb.append(times).append(chars[len - 1]).toString();
        }
        return str;
    }
}
