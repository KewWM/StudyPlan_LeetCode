package ProgrammingSkills1;

public class Day10_404_SumofLeftLeaves
{
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int sumOfLeftLeaves(TreeNode root)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 0;

        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right==null)
        {
            sum += root.left.val;
        }

        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}