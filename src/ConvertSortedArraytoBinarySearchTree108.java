// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.


public class ConvertSortedArraytoBinarySearchTree108 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode solution(int[] nums) {
        return makeTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode makeTreeNode(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = makeTreeNode(nums, left, mid - 1);
        node.right = makeTreeNode(nums, mid + 1, right);
        return node;
    }
}
