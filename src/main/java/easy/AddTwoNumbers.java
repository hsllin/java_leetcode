package easy;

import bean.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 题目描述
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * <p>
 * 解题思路：分别遍历两个listnode，用while循环，当链表都还有值时就一直操作，用carry=s/10去装两数之和可能发生的进位，
 * s%10为结果链表要装的和，l1 = l1 == null ? null : l1.next;表示获取下一节点
 */
@Slf4j
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while (null != l1 || null != l2 || carry != 0) {
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = s / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            result.next = new ListNode(s % 10);
            result = result.next;
        }
        return temp.next;

    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(2);
        test1.next.next = new ListNode(4);

        ListNode test2 = new ListNode(2);
        test2.next = new ListNode(3);
        test2.next.next = new ListNode(5);
        ListNode result = addTwoNumbers(test1, test2);
        log.info("result:" + result);
    }


}
