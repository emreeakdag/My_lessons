public class Stack {

    // LIFO = Last In First Out

    // Design the Stack Class
    // Push: to add the new member
    // Pop: to delete the last added member of Stack
    // Peek: check out the top member of Stack ( without delete)
    // isEmpty: check out the list's state of empty

    // Fundamental Stack Structure
    int[] stackArray;   // storage array for our stack
    int top;            // top is keep the index's member of peak of the stack
    int capacity;       // capacity of stack

    // Constructor: let's designate Stack's size of start capacity
    public Stack(int size){
        capacity = size;
        stackArray = new int[capacity];
        top = -1; // at the start, stack is empty so top is -1
    }

    // Add the new number to Stack (Push)
    public void push(int value){

        if(top == capacity -1){
            System.out.println("Stack is full"); // it's for if stack is full
        }
        else{
            stackArray[++top] = value; // add one value of top and then add new number in the Stack
            System.out.println(value + " Pushed to stack");
        }
    }

    // Delete the last number of Stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            int poppedValue = stackArray[top];
            top--; // subtract the top
            System.out.println("popped value is " + poppedValue);
        }
    }

    // check out the peek of Stack
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is " + stackArray[top]);

        }
    }

    // check out the list's state of empty
    public boolean isEmpty(){
        return top == -1; // if top is -1 so stack is empty
    }

    // return the size of stack
    public void size(){
        System.out.println("Size: " + top + 1);
    }

    // print Stack
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements: ");
            for( int i = 0; i <= top; i++)
                System.out.print(stackArray[i] + " ->");
        }
        System.out.print("|");
        System.out.println();
    }
}
