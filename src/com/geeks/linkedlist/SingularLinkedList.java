package com.geeks.linkedlist;
class Node{
	int data;
	Node nextNode;
	public Node(int new_data) {
		data = new_data;
		nextNode = null;
	}
}
public class SingularLinkedList {

	public static Node insertNodeInBeginning(Node head,int new_data) {
		//create new node with the given data
		Node new_node = new Node(new_data);
		
		//Make the next of the new node point to the current node
		new_node.nextNode = head;
		
		//return the new node as the new head of the list 
		return new_node;
		
	}
	
	public static void printSinglyLinkedList(Node head) {
		//start from the head of the list
		Node current = head;
		
		//Traverse the list
		while(current!=null) {
			System.out.println("  "+current.data);
			
			//Move to the next node
			current = current.nextNode;
		}
		//New line 
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
