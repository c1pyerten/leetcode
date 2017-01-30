// Given a binary tree, return all root-to-leaf paths.
//
//        For example, given the following binary tree:
//
//        1
//        /   \
//        2     3
//        \
//        5
//        All root-to-leaf paths are:
//
//        ["1->2->5", "1->3"]


import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath257 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private List<String> answer = new ArrayList<>();

    public List<String> solution(TreeNode root) {
        if (root == null) return answer;
        String s = "" + root.val;
        if (root.left == null && root.right == null) {
            answer.add(s);
            return answer;
        }
        if (root.left != null) helper(s, root.left);
        if (root.right != null) helper(s, root.right);
        return answer;
    }

    private void helper(String str, TreeNode cur) {
        str += "->" + cur.val;
        if (cur.left == null && cur.right == null) {
            answer.add(str);
            return;
        }
        if (cur.left != null) helper(str, cur.left);
        if (cur.right != null) helper(str, cur.right);
    }

    // solution2
    public List<String> solution2(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) search("", root, answer);
        return answer;
    }

    private void search(String str, TreeNode cur, List<String> answer) {
        if (cur.left == null && cur.right == null) answer.add(str + cur.val);
        if (cur.left != null) search(str + cur.val + "->", cur.left, answer);
        if (cur.right != null) search(str + cur.val + "->", cur.right, answer);
    }
}
