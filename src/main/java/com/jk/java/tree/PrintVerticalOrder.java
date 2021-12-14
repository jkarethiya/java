package com.jk.java.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintVerticalOrder {

	public static void main(String[] args) {

		Node<Integer> root = new Node<>(1);

		root.left = new Node<>(2);
		root.right = new Node<>(3);
		root.left.left = new Node<>(4);
		root.left.right = new Node<>(5);
		//root.right.left = new Node<>(6);
		//root.right.right = new Node<>(7);
		//root.right.left.right = new Node<>(8);
		//root.right.right.right = new Node<>(9);
		System.out.println(printLevelOrder(root));

		Map<Integer, List<Integer>> map = new TreeMap<>();

		getVerticalOrder(root, 0, map);

		System.out.println("Vertical Order traversal is ");
		
		map.values().forEach(v -> System.out.println(v));

	}

	private static void getVerticalOrder(Node<Integer> root, int hd, Map<Integer, List<Integer>> map) {
		if (root == null) {
			return;
		}

		List<Integer> list = map.computeIfAbsent(hd, v -> new LinkedList<>());
		list.add(root.data);

		getVerticalOrder(root.left, hd - 1, map);
		getVerticalOrder(root.right, hd + 1, map);

	}

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	private static Queue<Node<Integer>> printLevelOrder(Node<Integer> root) {
		Queue<Node<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {

			/*
			 * poll() removes the present head. For more information on poll() visit
			 * http://www.tutorialspoint.com/java/ util/linkedlist_poll.htm
			 */
			Node<Integer> tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			/* Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/* Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}

		return queue;
	}

}
