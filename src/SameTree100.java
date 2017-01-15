// Given two binary trees, write a function to check if they are equal or not.
//
//        Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


public class SameTree100 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean solution(TreeNode p, TreeNode q) {
//        if (p == null || q == null) return p == q;
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return (solution(p.left, q.left) && solution(p.right, q.right));
    }

}
