public class LinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public LinkedList() {
    }

    public LinkedList(int size) {
        this.size = size;

        for (int i = 0; i < this.size; i++) {
            Node<T> node = new Node<>(null, null, null);
            if (firstNode != null) {
                lastNode.setNextNode(node);
                lastNode = node;
            } else {
                firstNode = node;
                lastNode = firstNode;
            }
        }
    }

}
