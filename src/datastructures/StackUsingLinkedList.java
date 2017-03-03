package datastructures;

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class StackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}

class Stack {

	private static class Node {
		int data;
		Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node top = null;
	private int size = 0;

	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int data) {
		Node node = new Node(data);
		if (top == null) {
			node.next = null;
		} else {
			node.next = top;
		}
		top = node;
	}

	public int pop() {
		if (top == null) {
			return -1;
		}
		Node tmp = top;
		top = top.next;
		return tmp.data;
	}

	public int peek() {
		if (top == null) {
			return -1;
		}
		return top.data;
	}

}
