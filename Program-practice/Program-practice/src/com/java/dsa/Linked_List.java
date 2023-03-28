package com.java.dsa;

public class Linked_List {

	LinkedList_Node head;

	public void insert(int data) {
		LinkedList_Node node = new LinkedList_Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			LinkedList_Node n = head;
			while (n.next != null) {
				n = n.next;

			}
			n.next = node;

		}
	}
	public void show() {
		LinkedList_Node node= head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
