package com.interview.datastructure;



public class LinkedLists {
	Node head;
	private int size;
	public LinkedLists() {
		size=0;
	}
	
	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
			size++;

		}
	}
	public void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
	}
	
	
	public static void main(String[] args) {
		Object object = new Object();
		
		
	}
}


