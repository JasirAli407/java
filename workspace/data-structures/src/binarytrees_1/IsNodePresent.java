package binarytrees_1;

public class IsNodePresent {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}

		if (root.data.equals(x)) {
			return true;
		}

		return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
	}

	public static void main(String[] args) {

	}

}
