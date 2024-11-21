public class Queue {

    // FIFO = First In First Out

    // Queue Data Structure Fundamental
    // front: that's pointer of head of Queue
    // rear: that's pointer of end of Queue

    int[] queueArray;   // storage array of our Queue
    int front;          // head of Queue
    int rear;           // end of Queue
    int size;           // it's available size of Queue(mevcut boyutu)
    int capacity;       // max capacity of Queue

    // let's create constructor method
    public Queue(int capacity){
        this.capacity = capacity;           // set the maximum capacity
        queueArray = new int[capacity];     // create the array
        front = 0;                          // head of Queue is 0 at the beginning
        rear = -1;                          // rear is -1 so, Queue is empty at the beginning
        size = 0;                           // Queue is empty at the beginning
    }

    // Add the number - enqueue
    public void enqueue(int data){
        if(size == capacity){
            isFull();
        }else {

            rear = (rear + 1) % capacity; // dairesel artış
            queueArray[rear] = data;
            size++;
            System.out.println(data + " added the Queue");
        }
    }

    // Delete the number - dequeue
    public void dequeue(){
        if(size == 0){
            isEmpty();
        }
        else{

            int data = queueArray[front];
            front = (front + 1) % capacity; // Dairesel artış
            size--;
            System.out.println(data + " is deleted");
        }
    }

    // check out the head of Queue
    public void peek(){
        if(size == 0){
            System.out.println("Queue is empty, it has not peek");
        }else{
            System.out.println("peek is " + queueArray[front]);
        }
    }

    // check out the size of Queue
    public void queueSize(){
        System.out.println("Size is " + size);
    }

    // check out the state of empty of Queue
    public void isEmpty(){
        if(size == 0){
            System.out.println("Queue is empty, it couldn't delete");
        }
    }

    // check out the state of full of Queue
    public void isFull(){
        if(size == capacity){
            System.out.println("Queue is full, it couldn't add");
        }
    }

    // print the Queue
    public void printQueue(){
        System.out.print("Queue: ");
        for(int i = 0; i < size; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ->"); // Dairesel ilerleme
        }
        System.out.println();
    }

}
