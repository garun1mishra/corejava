package javaprograms;

import java.util.Scanner;

/* Link list node */
class Node  
{
 int data;
 Node next;
 Node(int d) 
 {
	 data = d;
     next = null;
 }
}
   

public class MergeLists {
	Node head; 
	/* Method to insert a node at  
the end of the linked list */
public void addToTheLast(Node node)  
{
 if (head == null)
 {
     head = node;
 }
 else
 {
     Node temp = head;
     while (temp.next != null)
         temp = temp.next;
     temp.next = node;
 }
}

/* Method to print linked list */
void printList(){
 Node temp = head;
 while (temp != null) {
     System.out.print(temp.data + " ");
     temp = temp.next;
 } 
 System.out.println();
}

//Driver Code
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/* Let us create two sorted linked
    lists to test the methods  
    Created lists:
        llist1: 5->10->15,
        llist2: 2->3->20
 */
 MergeLists llist1 = new MergeLists();
 System.out.println("Enter the number of node you want to create for first list : ");
   int number_of_node1 = sc.nextInt();
   System.out.println("Enter nodes - 1: ");
   for(int i=0; i < number_of_node1; i++) {
	llist1.addToTheLast(new Node(sc.nextInt() ));
   } 
 MergeLists llist2 = new MergeLists();   
 System.out.println("Enter the number of node you want to create for second list : ");
 int number_of_node2 = sc.nextInt();
 System.out.println("Enter nodes - 2: ");
 for(int i=0; i < number_of_node2; i++) { 
	llist1.addToTheLast(new Node(sc.nextInt() )); }
 Gfg gfg = new Gfg();
 llist1.head = gfg.sortedMerge(llist1.head,  
         llist2.head);
 
 llist1.printList();   
	}

}

class Gfg
{
/* Takes two lists sorted in  
increasing order, and splices  
their nodes together to make  
one big sorted list which is  
returned. */

Node sortedMerge(Node headA, Node headB)
{
   
 /* a dummy first node to  
    hang the result on */
 Node dummyNode = new Node(0);
   
 /* tail points to the  
 last result node */
 Node tail = dummyNode;
 while(true)  
 {
       
     /* if either list runs out,  
     use the other list */
     if(headA == null)
     {
         tail.next = headB;
         break;
     }
     if(headB == null)
     {
         tail.next = headA;
         break;
     }
       
     /* Compare the data of the two
     lists whichever lists' data is  
     smaller, append it into tail and
     advance the head to the next Node
     */
     if(headA.data <= headB.data)
     {
         tail.next = headA;
         headA = headA.next;
     }  
     else
     {
         tail.next = headB;
         headB = headB.next;
     }
       
     /* Advance the tail */
     tail = tail.next;
 }
 return dummyNode.next;
}

}

