package LeetCode75;

public class Day8_235_LowestCommonAncestorofaBinarySearchTree
{
    public class TreeNode
    {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max)
    {
        if (root == null)
        {
            return true;
        }

        if (min != null && root.val <= min.val)
        {
            return false;
        }

        if (max != null && root.val >= max.val)
        {
            return false;
        }
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }
}
