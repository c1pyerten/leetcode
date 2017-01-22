// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//        3
//        / \
//        9  20
//          /  \
//        15   7
//        return its level order traversal as:
//       [
//        [3],
//        [9,20],
//        [15,7]
//       ]


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            answer.add(list);
        }
        return answer;
    }

    public List<List<Integer>> solution2(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;
        dfs(answer, root, 0);
        return answer;
    }

    private void dfs(List<List<Integer>> answer, TreeNode cur, int level) {
        if (cur == null) return;
        if (answer.size() <= level) {
            answer.add(new ArrayList<>());
        }
        answer.get(level).add(cur.val);
        dfs(answer, cur.left, level+1);
        dfs(answer, cur.right, level+1);
    }

}
