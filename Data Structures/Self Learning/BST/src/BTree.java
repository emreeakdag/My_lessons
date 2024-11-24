public class BTree {



    Node root;

    public BTree(){
        root = null;
    }

    // Ağaca bir düğüm ekleyen yapı(metot) oluşturacağız
    Node newNode(int data){

        // bu metot root u kayıt eder, kaybolmasını engeller

        System.out.println(data + " ağaca eklendi");

        // root u nesne olarak oluşturalım
        root = new Node(data);
        return root;
    }


    // kökü ve ekleyeceğimiz sayıyı parametre olarak gönderelim
    Node insert (Node root, int data){

        if(root != null){

            if(data < root.data){
                root.left = insert(root.left,data);
            }
            else {
                root.right = insert(root.right, data);
            }
        }
        else {
            root = newNode(data);
        }
        return root;
    }


    // SEARCHING TYPES

    // preOrder(önce kök), inOrder(orta kök), postOrder(son kök)
    // first of all, we have some numbers:
    // 10, 8, 15, 5, 12, 20, 9

    // preOrder searching = 10, 8, 5, 9, 15, 12, 20
    // inOrder searching = 5, 8, 9, 10, 12, 15, 20
    // postOrder searching = 5, 9, 8, 12, 20, 15, 10

    void preOrder(Node root){

        if(root != null){

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }


    }

    void inOrder(Node root){
        if(root != null){

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

    }


}
