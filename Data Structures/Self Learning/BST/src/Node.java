public class Node {

    int data;
    // we keep a value variable in data and every data variable has two pointer.
    // this pointers:
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
        // assign null value to pointers to defalut
        right = null;
        left = null;
    }


}
