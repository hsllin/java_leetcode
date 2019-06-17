package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/17
 * Description:
 * Add Binary
 * Description
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * Tags: Math, String
 *
 * @link https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public static void main(String[] args) {

        String result = addBinary("1111", "110");
        String result2 = addBinaryTwo("1111", "110");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(1 >> 1);
    }


    /**
     * 自己的第一想法是调用已有的java api实现
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        try {
            Integer one = Integer.parseInt(a, 2);
            Integer two = Integer.parseInt(b, 2);
            return Integer.toBinaryString(one + two);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return "您输入的数字格式不是二进制的";
        }

    }

    /**
     * 题意:给你两个二进制串，求其和的二进制串
     * 思路：分别从两个字符串的尾部往前遍历相加，用carry的值作为是否进位的判断，每次计算完carry都要carry>>=1右移一位;
     * 关键点：数字和ASCII码的转换需要注意；最后的carry为1时需要进位+1
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinaryTwo(String a, String b) {
        StringBuilder sb = new StringBuilder(16);
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int carry = 0;
        while (p1 >= 0 && p2 >= 0) {
            //'1'-'0' = 1;'0'-'0'=0;char类型的存储的是ASCII吗，需要-'0'转换
            carry += a.charAt(p1--) - '0';
            carry += b.charAt(p2--) - '0';
            //carry >>=1;相当于carry = carry>>1;
            //与'1'-'0'=1相对的，1+'0' = '1';0+'0' ='0';
            sb.insert(0, (char) (carry % 2 + '0'));
            carry = carry >> 1;
        }
        while (p1 >= 0) {
            carry += a.charAt(p1--) - '0';
            sb.insert(0, (char) (carry % 2 + '0'));
            carry = carry >> 1;
        }
        while (p2 >= 0) {
            carry += b.charAt(p2--) - '0';
            sb.insert(0, (char) (carry % 2 + '0'));
            carry = carry >> 1;
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}
