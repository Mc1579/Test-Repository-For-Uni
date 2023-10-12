public class Node {
        private Object obj;
        private Node next;

        public Node(Object o, Node n) {
            obj = o;
            next = n;
        }

        public Node() {
            obj = null;
            next = null;
        }

        public void setElement(Object o) {
            obj = o;
        }

        public Object getElement() {
            return obj;
        }

        public void setNext(Node n) {
            next = n;
        }

        public Node getNext() {
            return next;
        }
    }