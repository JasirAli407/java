package binarytrees_1;

public class RemoveLeafNodes {

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);

		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = TakeTreeInputBetter.takeTreeInputBetter(true, 0, false);
		PrintTreeDetailed.printTreeDetailed(root);
		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
		PrintTreeDetailed.printTreeDetailed(newRoot);

	}

}
