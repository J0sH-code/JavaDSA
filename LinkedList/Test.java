
public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> secondList = new LinkedList<>(5);
        

        secondList.printAllElements();

        linkedList.add("Josh");
        linkedList.add("Ryle");
        linkedList.add("Santeno");

        linkedList.replace(2, "replaced");
        linkedList.insertAt(2, "new element");
        linkedList.printAllElements();

        LinkedList<String> reversedList = linkedList.reversed();
        reversedList.printAllElements();

        System.out.println(reversedList.getSize());
        System.out.println(reversedList.getFirstNode().getData());
    }
}
