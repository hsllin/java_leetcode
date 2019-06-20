package easy;

import sun.awt.image.ImageWatched;

/**
 * Author: huangsonglin
 * Date:2019/6/20
 * Description:
 * Remove Duplicates from Sorted Array
 * Description
 * Remove Duplicates from Sorted List
 * Description
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * Tags: Linked List
 *
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

public class RemoveLinkedDuplicates {

    public static void main(String[] args) {
        LinkNode linkNode = new LinkNode(1);
        linkNode.next = new LinkNode(1);
        LinkNode result = deleteDuplicateNode(linkNode);
        while (result != null) {
            System.out.println(result.index);
            result = result.next;
        }
    }

    /**
     * 题意是删除链表中重复的元素
     * 思路：遍历链表，比较下一个节点是否与当前节点的值相同即可
     * 关键点： 移除一个节点header.next = header.next.next
     *
     * @param node
     * @return
     */
    public static LinkNode deleteDuplicateNode(LinkNode node) {

        if (node == null || node.next == null) {
            return node;
        }
        LinkNode header = node;
        while (header.next != null) {
            LinkNode p = header.next;
            if (header.index == p.index) {
                //删除对应的下一个节点
                header.next = p.next;
            } else {
                //否则不删除
                header = header.next;
            }
        }
        return node;
    }

    public static LinkNode deleteDuplicates(LinkNode head) {
        if (head == null || head.next == null) return head;
        LinkNode curr = head;
        while (curr.next != null) {
            if (curr.next.index == curr.index) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static class LinkNode {
        int index;
        LinkNode next;

        public LinkNode(int index) {
            this.index = index;

        }
    }
}
