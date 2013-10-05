interface FifoCollection <E> { // interface for FIFO-liste
	public void insertLast(E e);
	public E get();
}

class Main {
	public static void main(String[] args) {
		// lager en liste med PS3-spill.
		GameContainer <PS3Game> ps3List = new GameContainer <PS3Game>();
	}
}

// extender Game, for man skal lage en liste med KUN objekter av Game.
// implementerer FifoCollection fordi vi vil ha de metodene.

class GameContainer <E extends Game> implements FifoCollection <E> {
	Node head;

	public void insertLast (E e) {
		if (head == null) {
			head = new Node(e);
		} else {
			Node tmp = head;
			// saa lenge head sin neste ikke er null, gaar man videre.
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			// naar man har funnet den som har null som sin neste,
			// saa setter man inn en ny node.
			tmp.next = new Node(e);
		}
	}

	public E get (E e) {
		return head.element;
	}

	// siden Node er en intern klasse, saa trenger vi ikke sette <E>.
	class Node {
		E element; // objektet noden vil peke paa.
		Node next;

		Node (E element) {
			this.element = element;
		}
	}
}

class Game {
	private String name;

	public Game (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class PS3Game extends Game {
	public PS3Game (String name) {
		super(name); // faar fatt i konstruktoren i superklassen Game.
	}
}
