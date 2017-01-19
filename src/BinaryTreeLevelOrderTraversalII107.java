// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//        3
//       / \
//      9  20
//        /  \
//       15   7
//
//        return its bottom-up level order traversal as:
//       [
//        [15,7],
//        [9,20],
//        [3]
//       ]


import java.util.*;

public class BinaryTreeLevelOrderTraversalII107 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> solutionBFS(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> answer = new ArrayList<>();

        if (root == null) return new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                list.add(cur.val);
            }
            answer.add(0, list);
        }
        return answer;
    }

    public List<List<Integer>> solutionDFS(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        dfs(answer, root, 0);
        return answer;
    }

    private void dfs(List<List<Integer>> answer, TreeNode cur, int level) {
        if (cur == null) return;
        if (answer.size() == level) {
            answer.add(new ArrayList<>());
        }

        dfs(answer, cur.left, level + 1);
        dfs(answer, cur.right, level + 1);
        answer.get(answer.size() - level + 1).add(cur.val);
    }
}
