public class LinkedList {

    Node head; // head of the list
    Node tail; // end of the list

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data); // create new node

        // if list is empty, head and tail pointer node of the head of list
        if(head == null){
            head = newNode;
            tail = newNode;
            System.out.println("List was empty but number " + data + " added as head of list");
        }
        else{ // if list is not empty, add the new node head of the list
            newNode.next = head;
            head = newNode;
            System.out.println("number " + data + " added head of the list");

        }
    }

    public void addLast(int data){

        Node newNode = new Node(data); // create new node

        // if list is empty, head and tail pointer node of the head of list
        if (head == null){
            head = newNode;
            tail = newNode;
            System.out.println("List was empty but number " + data + " added as end of list");
        }else{ // if list is not empty, connect the tail's next to new node
            tail.next = newNode;
            tail = newNode; // new node is tail now
            System.out.println("number " + data + " added end of the list");
        }

    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");


        }

        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
