package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/10
 * Description:
 * <p>
 * Remove Duplicates from Sorted Array
 * Description
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 * <p>
 * Internally you can think of this:
 * <p>
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 * <p>
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * Tags: Array, Two Pointers
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] testArrays1 = {0, 0, 1, 1, 2, 3, 4, 4, 5};
        int removedArraysLength = removeDuplicateArrays(testArrays1);
        System.out.println(removedArraysLength);
    }

    /**
     * 题目的意思是让你从一个有序的数组中移除重复的元素，并返回之后数组的长度，
     * 思路：用一个变量tail来存储比较过不同元素的下标，依次遍历数组，并将不重复的元素存到arrays[tail]
     * 中，同事返回tail就是去除重复元素的数组长度
     * @param arrays
     * @return
     */
    public static int removeDuplicateArrays(int[] arrays) {

        if (arrays.length == 1) {
            return 1;
        }
        //注意，tail为什么要从1算起，因为原数组的第一个元素array[0]不能算重复的元素，要去除得从array[1]起。
        int tail = 1;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] != arrays[i - 1]) {
                arrays[tail++] = arrays[i];
            }
        }
        return tail;
    }
}
