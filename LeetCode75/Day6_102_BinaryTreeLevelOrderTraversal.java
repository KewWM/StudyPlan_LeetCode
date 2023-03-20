package LeetCode75;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day6_102_BinaryTreeLevelOrderTraversal
{
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right)
        {
              this.val = val;
              this.left = left;
              this.right = right;
        }
    }
    class Node {
        public int val;
        public List<Day6_589_NaryTreePreorderTraversal.Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Day6_589_NaryTreePreorderTraversal.Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> mainlist = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
        {
            return mainlist;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> l = new LinkedList<Integer>();
            for(int i = 0; i < n; i++)
            {
                TreeNode cur = q.poll();
                l.add(cur.val);
                if(cur.left != null)
                {
                    q.add(cur.left);
                }
                if(cur.right != null)
                {
                    q.add(cur.right);
                }
            }
            mainlist.add(l);
        }
        return mainlist;
    }
}
