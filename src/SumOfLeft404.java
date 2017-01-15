// Find the sum of all left leaves in a given binary tree.
//
//        Example:
//
//        3
//        / \
//        9  20
//           /  \
//          15   7
//
//        There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.


public class SumOfLeft404 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int solution(TreeNode root) {
        if (root == null) return 0;

        int res = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                res += root.left.val;
            } else {
                res += solution(root.left);
            }
        }
        res += solution(root.right);
        return res;
    }


    public int solution2(TreeNode root) {
        if (root == null) return 0;

        return ((root.left!=null && root.left.left==null && root.left.right==null) ?
                root.left.val : 0)
                + solution2(root.left) +
                solution2(root.right);
    }

}
