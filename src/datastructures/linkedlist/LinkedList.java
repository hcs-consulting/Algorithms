package datastructures.linkedlist;

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class LinkedList {
	Node root;

	public LinkedList(int data) {
		root = new Node(data);
	}

	public void insert(int value) {
		Node start = root;
		while (start.next != null) {
			start = start.next;
		}
		Node newNode = new Node(value);
		start.next = newNode;
	}

	public void print_all() {
		Node start = root;
		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}
