public class SimpleList {
    private Node head = null;

    public SimpleList() {

        head = new Node();
    }

    public boolean isEmpty() {

        return head.getNext() == null;
    }

    public void addFirst(Object obj) {

        Node newNode = new Node(obj, head.getNext());
        head.setNext(newNode);
    }

    public Object removeFirst() {

        Node firstNode = head.getNext();
        if (firstNode != null) {
            head.setNext(firstNode.getNext());
            return firstNode.getElement();
        }
        return null;
    }

    public void addLast(Object o) {
        Node newNode = new Node();
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public Object getFirst() {
        Node firstNode = head.getNext();
        if (firstNode != null) {
            return firstNode.getElement();
        }
        return null;
    }

    public Object getLast() {
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getElement();
    }

    public Object removeLast() {

        Node current = head;
        Node previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        if (previous != null) {
            previous.setNext(null);
            return current.getElement();
        }
        return null;
    }
}