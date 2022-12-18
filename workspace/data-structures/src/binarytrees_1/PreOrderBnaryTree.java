package binarytrees_1;

public class PreOrderBnaryTree {
	public static void preOrder(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");

		preOrder(root.left);
		preOrder(root.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
