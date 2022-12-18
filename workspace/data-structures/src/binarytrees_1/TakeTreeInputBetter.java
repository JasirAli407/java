package binarytrees_1;

import java.util.Scanner;

public class TakeTreeInputBetter {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData,
			boolean isLeft) {
		Scanner s = new Scanner(System.in);
		if (isRoot) {
			System.out.println("enter root data");
		} else {
			if (isLeft) {
				System.out.println("enter left child of " + parentData + ":");
			} else {
				System.out.println("enter right child of " + parentData + ":");
			}

		}
		int rootData = s.nextInt();

		if (rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;

		return root;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
