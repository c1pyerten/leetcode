// Invert a binary tree.
//
//          4
//        /   \
//        2     7
//       / \   / \
//      1   3 6   9
//
//        to
//
//          4
//        /   \
//       7     2
//      / \   / \
//     9   6 3   1


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class InvertBinaryTree226 {
    // using recursive
    public TreeNode solution(TreeNode root) {
        if (root == null) return root;
        TreeNode tmp = root.left;
        root.left = solution(root.right);
        root.right = solution(tmp);
        return root;
    }

    // using BFS
    public TreeNode solutionBFS(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode left = current.left;
            TreeNode right = current.right;
            current.left = right;
            current.right = left;

            if (left != null) { queue.add(left); }
            if (right != null) { queue.add(right); }
        }
        return root;
    }
}
