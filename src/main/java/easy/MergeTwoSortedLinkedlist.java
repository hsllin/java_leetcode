package easy;

/**
 * Merge Two Sorted Lists
 * Description
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * Tags: Linked List
 * <p>
 * Author: huangsonglin
 * Date:2019/6/6
 * Description:
 */
public class MergeTwoSortedLinkedlist {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(2);
        test1.next.next = new ListNode(4);

        ListNode test2 = new ListNode(2);
        test2.next = new ListNode(3);
        test2.next.next = new ListNode(5);

        ListNode result = mergeTwoList(test1, test2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }

    /**
     * 题目：给出两个已排好序的链表，用一个新表来合并两个已排序链表的数据
     * 题意是用一个新链表来合并两个已排序的链表，那我们只需要从头开始比较已排序的两个链表，新链表指针每次指向值小的节点，依次比较下去，
     * 最后，当其中一个链表到达了末尾，我们只需要把新链表指针指向另一个没有到末尾的链表此时的指针即可。
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        //这里的返回值指向heade.next()比较难理解，其实head一开始储存的是链表的头，
        //ListNode temp = head;将temp的地址指向了head，但是temp一直在改变，这样head中的节点在慢慢增加，当其中一个链表走到了末尾，
        //新链表的指针就指向另一个没有带末尾的链表的指针，temp.next = l1!=null?l1:l2;最后head中的数据是0->1->2->2->3->4->5,所以返回head.next，即1->2->2->3->4->5
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return head.next;
    }

    /**
     * 自己模拟的一个链表的结构
     */
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
