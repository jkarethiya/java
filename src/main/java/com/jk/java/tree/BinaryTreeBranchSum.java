package com.jk.java.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeBranchSum {

	public static void main(String[] args) {
		BinaryTree left = new BinaryTree(2);
		left.setLeft(new BinaryTree(1));
		left.setRight(new BinaryTree(3));

		BinaryTree right = new BinaryTree(6);
		right.setLeft(new BinaryTree(5));
		right.setRight(new BinaryTree(7));

		BinaryTree root = new BinaryTree(4);
		root.setLeft(left);
		root.setRight(right);

		System.out.println(branchSums(root));
	}

	static class BinaryTree {

		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public BinaryTree getLeft() {
			return left;
		}

		public void setLeft(BinaryTree left) {
			this.left = left;
		}

		public BinaryTree getRight() {
			return right;
		}

		public void setRight(BinaryTree right) {
			this.right = right;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BinaryTree [value=");
			builder.append(value);
			builder.append(", left=");
			builder.append(left);
			builder.append(", right=");
			builder.append(right);
			builder.append("]");
			return builder.toString();
		}
	}

	static List<Integer> branchSums(BinaryTree root) {
		List<Integer> al = new ArrayList<>();
		sumHelper(root, 0, al);
		return al;
	}

	private static void sumHelper(BinaryTree root, int val, List<Integer> al) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			al.add(root.value + val);
			return;
		} else {
			sumHelper(root.left, root.value + val, al);
			sumHelper(root.right, root.value + val, al);
		}

	}

}
