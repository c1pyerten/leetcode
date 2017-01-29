// Given a binary tree, determine if it is height-balanced.
//
//        For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two ,
//        subtrees of every node never differ by more than 1.


public class BalancedBinaryTree110 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    // compare each two sub-tree
    public boolean solution(TreeNode root) {
        if (root == null) return true;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && solution(root.left) && solution(root.right);
    }

    private int depth(TreeNode cur) {
        if (cur == null) return 0;
        return Math.max(depth(cur.left), depth(cur.right)) + 1;
    }

    // using dfs
    public boolean solution2(TreeNode root) {
        return dfsDepth(root) != -1;
    }

    private int dfsDepth(TreeNode cur) {
        if (cur == null) return 0;

        int leftDepth = dfsDepth(cur.left);
        if (leftDepth == -1) return -1;
        int rightDepth = dfsDepth(cur.right);
        if (rightDepth == -1) return -1;
        if (Math.abs(leftDepth - rightDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
