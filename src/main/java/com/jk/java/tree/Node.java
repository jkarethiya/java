package com.jk.java.tree;

import java.util.Objects;

public class Node<T> {

	public Node(T data) {
		this.data = data;
	}

	T data;
	Node<T> left;
	Node<T> right;

	@Override
	public int hashCode() {
		return Objects.hash(left);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<T> other = (Node<T>) obj;
		return Objects.equals(left, other.left);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append(", left=");
		builder.append(left);
		builder.append(", right=");
		builder.append(right);
		builder.append("]");
		return builder.toString();
	}

	public T getData() {
		return data;
	}

	public void setData(T value) {
		this.data = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

}
