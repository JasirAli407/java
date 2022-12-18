package binarytrees_1;

public class CountNodesGreaterThanX {
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {

		if (root == null) {
			return 0;
		}

		int countLeft = countNodesGreaterThanX(root.left, x);
		int countRight = countNodesGreaterThanX(root.right, x);

		if (root.data > x) {
			return 1 + countLeft + countRight;
		} else {
			return countLeft + countRight;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
