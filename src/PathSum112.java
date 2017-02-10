// Total Accepted: 143598
//        Total Submissions: 434129
//        Difficulty: Easy
//        Contributors: Admin
//        Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//        For example:
//        Given the below binary tree and sum = 22,
//        5
//        / \
//        4   8
//        /   / \
//        11  13  4
//        /  \      \
//        7    2      1
//        return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.


public class PathSum112 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean solution(TreeNode root, int sum) {
        if (root == null) return false;
//        if (root.left == null && root.right == null) return sum == root.val;
        if (root.val == sum  && root.left == null && root.right == null) return true;
        return solution(root.left, sum - root.val) || solution(root.right, sum - root.val);
    }
}
