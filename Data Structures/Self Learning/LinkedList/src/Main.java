public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node eleman = new Node(4);
        Node eleman2 = new Node(3);


        // Add elements
        list.addLast(eleman);
        list.addLast(eleman2);


        // Print list
        System.out.print("Final list:");
        list.printList();
    }
}
