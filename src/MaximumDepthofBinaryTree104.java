// Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MaximumDepthofBinaryTree104 {
    private static int max;

    // using BFS
    public int solution(TreeNode root) {
        if (root == null) { return 0; }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int answer = 0;
        while (!queue.isEmpty()) {
            answer++;
            for (int i = 0, len = queue.size(); i < len; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
        }

        return answer;
    }

    // using recursive
    public int solution2(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(solution2(root.left), solution2(root.right));
    }
}
