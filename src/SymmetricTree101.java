// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//        1
//        / \
//       2   2
//      / \ / \
//     3  4 4  3
//        But the following [1,2,2,null,3,null,3] is not:
//        1
//       / \
//      2   2
//        \   \
//        3    3


import java.util.Stack;

public class SymmetricTree101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    // solution1
    public boolean solution(TreeNode root) {
        if (root == null) return true;
        return getLeft(root.left).equals(getRight(root.right));
    }

    private String getLeft(TreeNode cur) {
        if (cur == null) return " ";
        return getLeft(cur.left) + getLeft(cur.right) + cur.val;
    }

    private String getRight(TreeNode cur) {
        if (cur == null) return " ";
        return getRight(cur.right) + getRight(cur.left) + cur.val;

    }

    // solution2
    public boolean solution2(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    // solution3 using stack
    public boolean solution3(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root.left);
        st2.push(root.right);
        while (!st1.isEmpty() && !st2.isEmpty()) {
            TreeNode left = st1.pop();
            TreeNode right = st2.pop();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            st1.push(left.left);
            st1.push(left.right);
            st2.push(right.right);
            st2.push(right.left);
        }
        return st1.size() == st2.size();
    }
}
