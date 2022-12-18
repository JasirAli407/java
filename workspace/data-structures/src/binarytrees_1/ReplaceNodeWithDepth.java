package binarytrees_1;

public class ReplaceNodeWithDepth {
	public static void changeToDepth(BinaryTreeNode<Integer> root, int depth) {

		if (root == null) {
			return;
		}

		root.data = depth;

		changeToDepth(root.left, depth + 1);
		changeToDepth(root.right, depth + 1);

	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepth(root, 0);

	}

	public static void main(String[] args) {

	}

}
