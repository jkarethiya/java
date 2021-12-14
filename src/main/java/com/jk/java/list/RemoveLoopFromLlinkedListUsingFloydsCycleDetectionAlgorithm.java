package com.jk.java.list;

import com.jk.java.model.Node;

public class RemoveLoopFromLlinkedListUsingFloydsCycleDetectionAlgorithm {
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

	// Function to remove a cycle from a linked list pointed by `head` pointer.
	// The `slow` pointer points to one of the nodes involved in the cycle
	public static void removeCycle(Node slow, Node head) {
		// Do for each node of the linked list
		for (Node curr = head; curr != null; curr = curr.next) {
			// start a pointer `ptr` from the `slow` node and
			// check if it meets the current node `curr`
			Node ptr = slow;
			while (ptr.next != slow && ptr.next != curr) {
				ptr = ptr.next;
			}

			// If `ptr` meets `curr`, then that means there is a loop, and `curr`
			// points to the first node of the loop and `ptr` points to the last node
			if (ptr.next == curr) {
				// set next pointer of `ptr` to `null` to break the chain
				ptr.next = null;
				return;
			}
		}
	}

	// Function to identify a cycle in a linked list using
	// Floyd’s cycle detection algorithm
	public static Node identifyCycle(Node head) {
		// take two pointers – `slow` and `fast`
		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			// move slow by one pointer
			slow = slow.next;

			// move fast by two pointers
			fast = fast.next.next;

			// if they meet any node, the linked list contains a cycle
			if (slow == fast) {
				return slow;
			}
		}

		// we reach here if the slow and fast pointer does not meet
		return null;
	}

	public static void main(String[] args) {
		// total number of nodes in the linked list
		int n = 5;

		// construct a linked list
		Node head = null;
		for (int i = n + 1; i > 0; i--) {
			head = push(head, i);
		}

		// insert cycle
		head.next.next.next.next.next = head.next;

		// first check if a cycle is present in a linked list
		Node slow = identifyCycle(head);

		// if a cycle is found, remove it
		if (slow != null) {
			removeCycle(slow, head);
			printList(head);
		} else {
			System.out.println("No Cycle Found");
		}
	}
}
