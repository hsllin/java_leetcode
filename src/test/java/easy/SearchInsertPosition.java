package easy;

/**
 * Author: huangsonglin
 * Date:2019/6/12
 * Description:
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 7};
        int index = searchPosition(nums, 7);
        System.out.println(index);
    }

    /**
     * 这个是自己的写法，题意是让你从一个没有重复元素的已排序数组中找到插入位置的索引。因为数组已排序，所以我们可以想到二分查找法，
     * 因为查找到的条件是找到第一个等于或者大于 target 的元素的位置，所以二分法略作变动即可。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchPosition(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = (min + max) >> 1;
            if (nums[mid] < target) {
                //若中间的值小于target，则将中间值的下一个作为最小值
                min = mid + 1;
            } else if (nums[mid] > target) {
                //若中间值大于target，则将中间值的上一个作为最大值
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return min;

    }
}
