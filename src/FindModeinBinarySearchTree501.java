// Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
//
//        Assume a BST is defined as follows:
//
//        The left subtree of a node contains only nodes with keys less than or equal to the node's key.
//        The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
//        Both the left and right subtrees must also be binary search trees.
//        For example:
//        Given BST [1,null,2,2],
//        1
//        \
//         2
//        /
//        2
//        return [2].
//
//        Note: If a tree has more than one mode, you can return them in any order.


// TODO
//public class FindModeinBinarySearchTree501 {
//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//
//    public int[] solution(TreeNode root) {
//
//    }
//
//    private int helper(TreeNode cur) {
//        if (cur == null) return 0;
//        if (cur.left == null && cur.right == null) return 1;
//        if (cur.left == null && cur.val == cur.right.val) return 1 + helper(cur.right);
//        if (cur.right == null && cur.val == cur.left.val) return 1 + helper(cur.left);
//    }
//}
