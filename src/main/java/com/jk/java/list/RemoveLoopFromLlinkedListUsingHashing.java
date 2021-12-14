package com.jk.java.list;

import java.util.HashSet;
import java.util.Set;

import com.jk.java.model.Node;

public class RemoveLoopFromLlinkedListUsingHashing {
	// Utility function to create a new node with the given data and
	// pushes it onto the list's front
	public static Node push(Node head, int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		return node;
	}

	// Utility function to print a linked list
	public static void printList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " —> ");
			curr = curr.next;
		}
		System.out.println("null");
	}

	// Function to identify and remove cycle in a linked list using hashing
	public static void removeCycle(Node head) {
		Node prev = null; // previous pointer
		Node curr = head; // main pointer

		// maintain a set to store visited nodes
		Set<Node> set = new HashSet<>();

		// traverse the list
		while (curr != null) {
			// set the previous pointer to null if the current node is seen before
			if (set.contains(curr)) {
				prev.next = null;
				return;
			}

			// insert the current node into the set
			set.add(curr);

			// update the previous pointer to the current node and
			// move the main pointer to the next node
			prev = curr;
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		// total number of nodes in the linked list
		int n = 2;

		// construct a linked list
		Node head = null;
		for (int i = n + 1; i > 0; i--) {
			head = push(head, i);
		}

		printList(head);

		// insert cycle
		head.next.next = head.next;

		removeCycle(head);
		printList(head);
	}
}