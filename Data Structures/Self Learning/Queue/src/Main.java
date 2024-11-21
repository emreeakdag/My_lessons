//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue kuyruk = new Queue(5);


        kuyruk.peek();
        kuyruk.queueSize();

        kuyruk.enqueue(5);
        kuyruk.enqueue(4);
        kuyruk.enqueue(3);

        kuyruk.peek();
        kuyruk.queueSize();
        kuyruk.printQueue();

        kuyruk.dequeue();
        kuyruk.dequeue();

        kuyruk.peek();
        kuyruk.queueSize();
        kuyruk.printQueue();


    }
}