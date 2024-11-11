public class queue {
    private int[] queueArray;
    private int front; // Kuyruğun başını gösterir
    private int rear;  // Kuyruğun sonunu gösterir
    private int size;  // Kuyruktaki eleman sayısı
    private int capacity; // Kuyruğun toplam kapasitesi

    // Constructor
    public queue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Eleman ekleme (enqueue)
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Kuyruk dolu, eleman eklenemiyor.");
            return;
        }
        rear = (rear + 1) % capacity; // Dairesel kaydırma
        queueArray[rear] = element;
        size++;
        System.out.println(element + " kuyruğa eklendi.");
    }

    // Eleman çıkarma (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Kuyruk boş, eleman çıkarılamıyor.");
        }
        int removedElement = queueArray[front];
        front = (front + 1) % capacity; // Dairesel kaydırma
        size--;
        return removedElement;
    }

    // Kuyruğun başındaki elemanı görüntüleme
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Kuyruk boş.");
        }
        return queueArray[front];
    }

    // Kuyruğun boş olup olmadığını kontrol etme
    public boolean isEmpty() {
        return size == 0;
    }

    // Kuyruğun dolu olup olmadığını kontrol etme
    public boolean isFull() {
        return size == capacity;
    }

    // Kuyruktaki eleman sayısını döner
    public int size() {
        return size;
    }

    // Kuyruğu görüntüleme
    public void display() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş.");
            return;
        }
        System.out.print("Kuyruk: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Test için main metodu
    public static void main(String[] args) {
       queue queue = new queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Kuyruk: 10 20 30

        System.out.println("Çıkarılan eleman: " + queue.dequeue()); // 10 çıkarılır
        queue.display(); // Kuyruk: 20 30

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display(); // Kuyruk: 20 30 40 50 60

        System.out.println("Baş eleman: " + queue.peek()); // 20
    }
}
