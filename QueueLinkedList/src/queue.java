// aim: make a linked list based queue 

class Node{
	public int value  ; 
	public Node next ; // = new Node; 
}

class QueueLinkedList{
	private Node head; 
	
	QueueLinkedList(){
		head = null; 
	}
	
	public void enqueue(int data) {
		Node n = new Node(); 
		n.value = data; 
		n.next = null; 

		
		if(head == null) {
			head = n; 
		}
		
		else {
			Node temp = new Node(); 
					
			temp = head; 
			
			while(temp.next != null) {
				temp = temp.next; 
			}
			temp.next = n; 
		}
	}
	
	public int dequeue() {
		if(head == null) {
			System.out.println("The list is empty."); 
			return -1; 
		}
		
		else {
			int value = head.value; 
			head = head.next; 
			
			return value; 
		}
		
	}
	
	public void print() {
		Node temp = new Node(); 
		
		temp = head; 
		while(temp!= null) {
			System.out.print(temp.value + "-> "); 
			temp= temp.next; 
		}
	}
}


public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Hello world"); 
	
	
		QueueLinkedList q = new QueueLinkedList(); 
		
		q.enqueue(1);
		q.enqueue(11);
		q.enqueue(111);
	
		int i = q.dequeue(); 
	
		System.out.println("Dequeued : " + i); 
		q.print(); 
	}

}
