public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();

        stack.size();

        stack.printStack();

        System.out.println(stack.isEmpty());
    }
}
