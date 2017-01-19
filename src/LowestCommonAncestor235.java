// Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
//
//        According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
//
//        _______6______
//        /              \
//     ___2__          ___8__
//    /      \        /      \
//    0      _4       7       9
//          /  \
//          3   5
//
//        For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2,
//        since a node can be a descendant of itself according to the LCA definition.



public class LowestCommonAncestor235 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return solution(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return solution(root.right, p, q);
        } else {
            return root;
        }
    }

    public TreeNode solution2(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        if (find(p, q.val)) return p;
        while (root != null) {
            if (root.val < p.val) root = root.right;
            else if (root.val > q.val) root = root.left;
            else break;
        }
        return root;
    }

    private boolean find(TreeNode cur, int x) {
        if (cur == null) return false;
        if (cur.val > x) return find(cur.left, x);
        else if (cur.val < x) return find(cur.right, x);
        else return true;

    }
}
