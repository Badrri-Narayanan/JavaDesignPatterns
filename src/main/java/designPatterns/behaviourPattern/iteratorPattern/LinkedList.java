package designPatterns.behaviourPattern.iteratorPattern;

public class LinkedList<T> {
	private Node<T> head = null;
	
	private class Node <Y> {
		private Y data;
		private Node<Y> next;
		
		private Node(Y data) {
			this.data = data;
		}
	}
	
	public void add(T data) {
		Node<T> newData = new Node<T>(data);
		
		if(head == null)
			head = newData;
		else {
			Node<T> temp = head;
			
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = newData;
		}
	}
	
	public T pop() {
		if(head == null) {
			System.err.println("List is empty");
			return null;
		}
		
		Node<T> temp = head, prev;
		
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
			
			if(temp.next == null) {
				prev.next = null;
			}
		}
		
		return temp.data;
	}
	
	public void printAll() {
		if(head == null) {
			System.err.println("List is empty");
			return;
		}
		
		Node<T> temp = head;
		
		System.out.print("List = ");
		while(temp.next != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public Iterator<T> getIterator() {
		return new LinkedListIterator(this);
	}
	
	private class LinkedListIterator implements Iterator<T> {

		Node<T> currentElement;
		boolean hasEndReached = false;
		
		public LinkedListIterator(LinkedList<T> list) {
			this.currentElement = list.head;
		}
		
		@Override
		public T next() {
			T data = null;
			
			if(currentElement != null)
				data = currentElement.data;
			
			increment();
			
			return data;
		}
		
		private void increment() {
			if(currentElement.next != null)
				currentElement = currentElement.next;
			else
				hasEndReached = true;
		}

		@Override
		public boolean hasNext() {
			return !hasEndReached && currentElement != null;
		}

	}
}
