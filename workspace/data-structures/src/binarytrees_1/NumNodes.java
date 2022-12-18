package binarytrees_1;

public class NumNodes {

	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftNodes = numNodes(root.left);
		int rightNodes = numNodes(root.right);

		return 1 + leftNodes + rightNodes;

	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		BinaryTreeUse.printTreeDetailed(root);

	}

}
