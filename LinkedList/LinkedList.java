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
            Node<T> node = new Node<>(null, null, lastNode);
            if (firstNode != null) {
                lastNode.setNextNode(node);
                lastNode = node;
            } else {
                firstNode = node;
                lastNode = firstNode;
            }
        }
    }

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public Node<T> getLastNode() {
        return lastNode;
    }

    public int getSize() {
        return size;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element, null, lastNode);

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
        size++;
    }

    public void printAllElements(){
        int count = 1;
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            System.out.printf("%d. %s%n", count, currentNode.getData());
            count++;
            currentNode = currentNode.getNextNode();
        }
    }
}
