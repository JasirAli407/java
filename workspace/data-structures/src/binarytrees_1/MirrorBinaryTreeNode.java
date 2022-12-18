package binarytrees_1;

public class MirrorBinaryTreeNode {
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);

		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;

		//		    OR
		//		BinaryTreeNode<Integer> temp = root.left;
		//		root.left = root.right;
		//		root.right = temp;
		//		
		//		mirrorBinaryTree(root.left);
		//		mirrorBinaryTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
