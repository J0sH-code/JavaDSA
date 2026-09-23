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

    public void insertAt(int index, T element) {
        Node<T> currentNode;
        Node<T> nextNode;

        if (index == size) {
            Node<T> newNode = new Node<>(element, null, lastNode);
            lastNode.setNextNode(newNode);
            lastNode = newNode;

            size++;
        } else if (index == 0) {
            Node<T> newNode = new Node(element, nextNode, null);
            firstNode.setPreviousNode(newNode);
            firstNode = newNode;

            size++;
        } else {
            currentNode = traverseTo(index);
            nextNode = currentNode.getNextNode();

            Node<T> newNode = new Node<>(element, nextNode, currentNode);

            currentNode.setNextNode(newNode);

            nextNode.setPreviousNode(newNode);

            size++;
        }
    }

    public void replace(int index, T element){
        
    }

    public void delete(int index){ 
        Node<T> currentNode;
        Node<T> nextNode;

        if (index == (size - 1)) {
            Node<T> secondToLastNode = lastNode.getPreviousNode();
            secondToLastNode.setNextNode(null);
            lastNode = secondToLastNode;
            this.size--;
        } else {
            currentNode = traverseTo(index);
            nextNode = currentNode.getNextNode();

            Node<T> prevNode = currentNode.getPreviousNode();

            nextNode.setPreviousNode(prevNode);

            prevNode.setNextNode(nextNode);

            this.size--;
        }
    }

    private Node<T> traverseTo(int index){
        Node<T> currentNode = firstNode;

        for (int i = 0; i < (index - 1); i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
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

    public LinkedList<T> reversed(){
        LinkedList<T> reversedList = new LinkedList<>();

        Node<T> currentNode = lastNode;
        while (currentNode != null) {   
            reversedList.add(currentNode.getData());
            currentNode = currentNode.getPreviousNode();
        }
        
        return reversedList;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
