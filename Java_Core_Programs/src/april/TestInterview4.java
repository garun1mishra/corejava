/**
 * 
 */
package april;


/**
 * @author Garun Mishra
 *
 */
class Node{
	int data;
	Node next;
	
	Node(int d, Node n){
		this.data = d;
        this.next = n;
	}
}

public class TestInterview4 {

 
	
	
	public static void main(String[] args) {
		Node head =null;
		Node n1 = new Node(1, head); 
		Node n2 = new Node(2, n1.next);
		Node n3 = new Node(3, n2.next);

		
		pairREverseListList(head);
	}

	private static void pairREverseListList(Node head) {
		/*
		 [9:55 AM] Pankaj Sethia
    1 -> 2 -> 3 -> 4 -> 5
​[9:55 AM] Pankaj Sethia
    2 -> 1 -> 4 -> 3 -> 5 

		 */
		
		Node temp; 
		temp= head;
		
		while(head!= null) {
			temp.next.data = temp.next.next.data;
			
			
			
		}
		
	}
	
	

}
