
public class LinkedList <E> {
	
		private Node<E> head, tail; //this is the last item added in the list 
		private int size=0;
		
		/*
		 * Adding an element at the beginning of the list
		 * Steps:
		 * - declare head and tail
		 * - append by creating a new node
		 * - use .next from Node class as a pointer for the next Node
		 */
		public LinkedList() { //Empty constructor
			
		}
		
		public LinkedList(E[] objects) { //create a list from a new array
			for (int i=0; i < size; i++) {
				addFirst(objects[i]); //
			}
		}
		public E getFirst() {
			if (size==0) { //if it's empty, return null
				return null;
			}
			else {
				return head.element; //refers to the data in the Node class
			}
		}
		
		public E getLast() {
			if (size== 0) {
				return null;
			}
			else {
				return tail.element; //refers to the data in the Node Class
			}
		}
		
		public void addFirst(E e) {
			Node<E> firstNode= new Node<>(e); //refers to the constructor in the Node class
			firstNode.pointTo= head; //pointer using Node class referring the Node in LinkedList
			head= firstNode;
			size++; //increment everytime you create a new node.
		}
		
		public void addLast(E e) {
			Node<E> lastNode= new Node<>(e);
			if (tail == null) { //if empty head and tail is the same
				head= tail= lastNode; //head-->Node created 
			}
			else {
				tail.pointTo= lastNode; //assign Node to tail
				tail= lastNode; //
			}
		}
		public void add(int index, E e) {
			if (index==0) { //if index is zero, add to the first spot
				addFirst(e);
			}
			else if (index >= size) { // if greater than size, add to last spot
				addLast(e);
			}
			else {
				Node<E> current= head; //assign node to the head
				for (int i=0; i< index; i++) {
					current= current.pointTo; //current refers to next item
					Node<E> temp= current.pointTo; //temporary node
					current.pointTo= new Node<>(e); // make node in between current and temp
					(current.pointTo).pointTo= temp;
					size++; //don't forget to update the size all the time
				}
		
			}
		
		}
		public E removeFirst() {
			if (size==0) { //if list is empty, there's nothing to add
				return null;
			}
			else {
				Node<E> temp= head; //create a temp node and assign to second element
				head= head.pointTo; //remove by not including (decrimenting)
				size--;  //decrement the size
				if (head==null) { //if there's no list, both are null
					tail=null;
				}
				return temp.element; //return deleted element
			}
		}
		
		public E removeLast() {
			if (size==0) {
				return null;
			}
			else if(size==1) {
				Node<E> temp= head;
				head=tail=null;
				size=0; //zero after deletion
				return temp.element;
			}
			else {
				Node<E> current= head;
				
				for (int i=0; i < size-2;i++) {
					current= current.pointTo;
					
				Node<E> temp=tail;
				tail=current;
				tail.pointTo= null;
				size--;
				return temp.element;
				
				}
			}
			
			return null;
		}
		
}

