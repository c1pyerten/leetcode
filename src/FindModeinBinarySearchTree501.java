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


public class FindModeinBinarySearchTree501 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    // solution2
    private int modeCount;
    private int maxCount;
    private int curValue;
    private int curCount;
    private int[] modes;

    public int[] findMode2(TreeNode root) {
        inorder(root);
        modes = new int[modeCount];
        modeCount = 0;
        curCount = 0;
        inorder(root);
        return modes;
    }

    private void inorder(TreeNode cur) {
        if (cur == null) return;
        inorder(cur.left);
        handlerValue(cur.val);
        inorder(cur.right);
    }

    private void handlerValue(int value) {
        if (curValue != value) {
            curValue = value;
            curCount = 0;
        }
        curCount++;
        if (curCount > maxCount) {
            maxCount = curCount;
            modeCount = 1;
        } else if (curCount == maxCount) {
            if (modes != null) {
                modes[modeCount] = curValue;
            }
            modeCount++;
        }
    }
}
