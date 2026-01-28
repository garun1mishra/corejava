/**
 * 
 */
package javaprograms;

/**
 * @author Garun Mishra
 * @Description Java program to get intersection point of two linked list.
 *
 */
public class IntersectionPointOfList {

	/**
	 * @param args
	 */

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int data1) {
			data1 = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		IntersectionPointOfList list = new IntersectionPointOfList();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getNode());

	}

	int getNode() {
		int countNodeHead1 = getCount(head1);
		int countNodeHead2 = getCount(head2);
		int nodeDifference;
		if (countNodeHead1 > countNodeHead2) {
			nodeDifference = countNodeHead1 - countNodeHead2;
			// to get intersection
			return getIntesectionNode(nodeDifference, head1, head2);
		} else {
			nodeDifference = countNodeHead2 - countNodeHead1;
			// to get intersection
			return getIntesectionNode(nodeDifference, head2, head1);
		}
	}

	int getIntesectionNode(int nodeDifference, Node node1, Node node2) {
		int i;
		Node currentNode1 = node1;
		Node currentNode2 = node2;
		for (i = 0; i < nodeDifference; i++) {
			if (currentNode1 == null) {
				return - 1;
			}
			currentNode1 = currentNode1.next;
		}
		while (currentNode1 != null && currentNode2 != null) {
			if (currentNode1.data == currentNode2.data) {
				return currentNode1.data;
			}
			currentNode1 = currentNode1.next;
			currentNode2 = currentNode2.next;
		}

		return -1;
	}

	int getCount(Node node) {
		Node currentNode = node;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;

		}
		return count;
	}

}
