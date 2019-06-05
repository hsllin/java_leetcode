package easy;

/**
 * Valid Parentheses
 * Description
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 * Tags: Stack, String
 */
public class ValidParentheses {

    /**
     * 题目意思：给一个包含"{()}[]"的字符串，让你判断括号是否匹配；
     * 解题思路：可以利用栈进栈出栈的特性来解决，当匹配到"(,[,{"的时候，让其进栈，当遇到"),},]"时候出栈，如果该栈的上一个没有匹配直接返回false，然后判断该栈是否为空栈就可以了
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        char[] statcks = new char[s.length() + 1];
        int top = 1;
        //遇到[,{,(就入栈，遇到],),}就出栈，若上一个元素和这个括号不匹配，直接返回false，设置top==1，避免了不必要的判空操作和--top为-1数组越界的问题
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                statcks[++top] = c;
            } else if (c == ')' && statcks[--top] != '(') {
                return false;
            } else if (c == ']' && statcks[--top] != '[') {

            } else if (c == '}' && statcks[--top] != '{') {
                return false;
            }

        }
        //判断该栈是否已经是空栈了
        return top == 1;

    }
}
