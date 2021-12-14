package com.jk.java.model;

import java.util.Objects;

//A Linked List Node
public class Node {
	public int data;
	public Node next;

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Node other = (Node) obj;
		return data == other.data;
	}

}