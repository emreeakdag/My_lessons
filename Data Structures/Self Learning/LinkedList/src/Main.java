public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements
        list.addLast(1);
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);

        // Print list
        System.out.print("Final list:");
        list.printList();
    }
}
