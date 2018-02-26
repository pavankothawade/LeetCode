package LeetCode;

public class MaxDepthTree {
	private TreeNode root;
	
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data= data;
		}
		
	}
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left= second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		
	}
	
	public int maxDepth(TreeNode root) {
		if (root == null)
            return 0;
        else
        {
            
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
  
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
	}
	
	public static void main(String[] args) {
		MaxDepthTree bt = new MaxDepthTree();
		bt.createBinaryTree();
		System.out.println(bt.maxDepth(bt.root));

	}

}
