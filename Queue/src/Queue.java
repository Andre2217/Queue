
public class Queue {
	Node first;
	Node last;

	public Queue() {
		first = null;
		last = null;
	}

	public void enqueue(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	public void dequeue() {
		if (first == last) {
			first = null;
			last = null;
		} else {
			Node aux = first;
			first = first.next;
			aux.next = null;
		}
	}

	public void show() {
		Node current = first;
		while (current != null) {
			System.out.print(current.num + " ");
			current = current.next;
		}
		System.out.println();
	}
}
