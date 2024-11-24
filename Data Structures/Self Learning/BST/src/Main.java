public class Main {
    public static void main(String[] args) {

        // 10, 8, 15, 5, 12, 20, 9

        BTree bt = new BTree();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 5);
        bt.root = bt.insert(bt.root, 12);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 9);


        System.out.println("Kök data: " + bt.root.data);
        System.out.println("Kök datanın sağındaki düğüm: " + bt.root.right.data);
        System.out.println("Kök datanın solundaki düğüm: " + bt.root.left.data);
        System.out.println("Kök datanın solunun solundaki düğüm: " + bt.root.left.left.data);


        System.out.print("preOrder: ");
        bt.preOrder(bt.root);

        System.out.println(" ");
        System.out.print("inOrder: ");
        bt.inOrder(bt.root);

        System.out.println(" ");
        System.out.print("postOrder: ");
        bt.postOrder(bt.root);

    }
}