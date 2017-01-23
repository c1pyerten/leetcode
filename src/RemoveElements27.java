// Given an array and a value, remove all instances of that value in place and return the new length.
//
//        Do not allocate extra space for another array, you must do this in place with constant memory.
//
//        The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//        Example:
//        Given input array nums = [3,2,2,3], val = 3
//
//        Your function should return length = 2, with the first two elements of nums being 2.


public class RemoveElements27 {
    public int solution(int[] nums, int val) {
        int count = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < nums.length-count; i++) {
                if (nums[i] == val) {
                    swap(nums, i, nums.length - 1 - count);
                    count++;
                    flag = true;
                }
            }
        }
        return nums.length - count;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public int solution2(int[] nums, int val) {
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[begin++] = nums[i];
            }
        }
        return begin;
    }
}
