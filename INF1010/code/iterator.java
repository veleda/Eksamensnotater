import java.util.Iterator;

class It implements Iterator<E> {
	Node current;
	Node prev;
	boolean removeNext = false;

	It() {
		curr = new Node();
		curr.next = head;
		prev = curr;
	}

	public boolean hasNext() {
		return curr.next != null;
	}

	public E next() {
		if( hasNext() ) {
			removeNext = true;
			prev = curr;
			curr = curr.next;
			return curr.element;
		}
		throw new NoSuchElementException();
	}

	public void remove() {
		if(removeNext) {
			if(curr.element.compareTo(head.element) == 0) {
				head = head.next;
			} else {
				curr = prev;
				curr.next = curr.next.next;
			}
			removeNext = false;
		} else {
			throw new IllegalStateException();
		}
	}
}
