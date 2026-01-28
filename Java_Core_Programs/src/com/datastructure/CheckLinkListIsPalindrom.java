package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		next = null;
	}

}

public class CheckLinkListIsPalindrom {
	Node head;

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	public static void main(String[] args) {
		CheckLinkListIsPalindrom createLinkList = new CheckLinkListIsPalindrom();
		// Create Linked List
		System.out.println("How many node you want to create : ");
		Scanner sc = new Scanner(System.in);
		int noOfNode = sc.nextInt();
		System.out.println("Enter " + noOfNode + " value of node : ");
		for (int i = 0; i < noOfNode; i++) {
			int value = sc.nextInt();
			createLinkList.insertAtLast(value);
		}
		createLinkList.printList(createLinkList.head);
  System.out.println();
		if (createLinkList.isPalindrome(createLinkList.head)) {
			System.out.println("Palindrome Linked List");
		} else {
			System.out.println("Not a Palindrome Linked List");
		}
// Find the Middle value by index
		int val =   createLinkList.middleElement(createLinkList.head);
		System.out.println("The middle element is  :  " +val);
		 System.out.println();
		createLinkList.printList(createLinkList.head);
		  System.out.println();
		// Swap the list pair wise
		System.out.println("After Swap ");
		createLinkList.pairWiseSwapTheList(createLinkList.head);
	// Remove duplicate from the sorted list
		createLinkList.removeDuplicateList(createLinkList.head);

	}
	

	

	private int middleElement(Node head2) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			index++;
			temp = temp.next;
		}
		int midIndex = index/2;
		 temp = head;
		while (midIndex != 0) {
			temp =  temp.next;
			 midIndex--;
			}
		return temp.data;
	}

	private boolean isPalindrome(Node head) {
		Stack<Integer> myStack = new Stack<>();
		Node temp = head;
		boolean status = false;
		// pushing the element of Listnked list to stack;
		while (temp != null) {
			myStack.push(temp.data);
			temp = temp.next;
		}
		temp = head;

		while (temp != null) {
			int element = myStack.pop();
			if (temp.data == element) {
				status = true;
				temp = temp.next;

			} else {
				status = false;
				break;
			}
		}
		return status;
	}
	
	private void pairWiseSwapTheList(Node head) {
		Node temp = head;
		
		while(temp!= null && temp.next != null) {
			int tempValue = temp.data;
			temp.data = temp.next.data;
			temp.next.data = tempValue;
			temp = temp.next.next;			
		}
		System.out.println();
	//Display the list
		while(head!= null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		
	}

	private void pairWiseSwapTheList1(Node head) {
		Node temp = head;
		
		while(temp!= null && temp.next != null) {
			int tempValue = temp.data;
			temp.data = temp.next.data;
			temp.next.data = tempValue;
			temp = temp.next.next;			
		}
		System.out.println();
	//Display the list
		while(head!= null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		
	}
	
	private void removeDuplicateList(Node head2) {
		Node currentNode = head2;
		while(currentNode!= null) {
			Node temp = head2;
			
			
			
			
		}
			
			//Display the list
			while(head2!= null) {
				System.out.print(head.data + " -> ");
				head = head.next;
			}
		
	}
	

}
