package LeetCode75;

public class Day8_98_ValidateBinarySearchTree
{
    public class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==q || root==p)
            return root;
        if(root.val<q.val && root.val>p.val)
            return root;
        if(root.val<q.val && root.val<p.val)
            return lowestCommonAncestor(root.right,p,q);
        if(root.val>q.val && root.val>p.val)
            return lowestCommonAncestor(root.left,p,q);
        else return root;
    }
}
