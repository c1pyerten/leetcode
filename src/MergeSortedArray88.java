// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
// Note:
// You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.


public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int i = 0;
        int j = 0;
        int[] res = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) res[index++] = nums1[i++];
            else res[index++] = nums2[j++];
        }
        if (i == m) {
            while (j < n) {
                res[index++] = nums2[j++];
            }
        } else {
            while (i < m) {
                res[index++] = nums1[i++];
            }
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        while (m + n - 1 >= 0) {
            nums1[m+n-1] = (m == 0 || nums2[n-1] > nums1[m-1]) ? nums2[n--] : nums1[m--];
        }
    }
}
