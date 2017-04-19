package datastructures;

/*
 * Implement Queue data structure form scratch
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class Queue {
	
	private Node head;
	private Node tail;
	
	private static class Node{
		int data;
		Node next;
		private Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int peek(){
		if(head==null){
			return -1;
		}
		return head.data;
	}
	
	public void add(int data){
		Node newnode = new Node(data);
		if(tail!=null){
			tail.next = newnode;
		}
		tail=newnode;
		if(head==null){
			head=newnode;
		}
	}
	
	public int remove(){
		return 0;
	}
	

}
