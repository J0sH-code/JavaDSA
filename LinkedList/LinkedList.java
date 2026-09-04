public class LinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedList() {
    }

    //Creates a linkedList with size number of null nodes
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

    public void add(T element) {
        if (firstNode == null) {
            firstNode = new Node<>(element, null, null);
            lastNode = firstNode;
            size++;
        }

        Node<T> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            Node<T> prevNode = currentNode;
            currentNode = currentNode.getNextNode();

            if (currentNode == null) {
                Node<T> node = new Node<>(element, null, prevNode);
                currentNode = node;
                lastNode = currentNode;
                size++;
            }
        }
    }

    public void printAllElements(){
        
    }
}
