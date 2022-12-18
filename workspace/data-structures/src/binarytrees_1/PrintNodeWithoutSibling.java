package binarytrees_1;

public class PrintNodeWithoutSibling {
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		if (root.left != null && root.right == null) {
			System.out.print(root.left.data + " ");

		}

		else if (root.left == null && root.right != null) {
			System.out.print(root.right.data + " ");

		}

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
